SUMMARY = "An AuthCookie module backed by a DBI database"
DESCRIPTION = "This module is an authentication handler that uses the basic mechanism \
provided by Apache2::AuthCookie with a DBI database for ticket-based \
protection. It is based on two tokens being provided, a username and \
password, which can be any strings (there are no illegal characters for \
either). The username is used to set the remote user as if Basic \
Authentication was used. \
 \
On an attempt to access a protected location without a valid cookie being \
provided, the module prints an HTML login form (produced by a CGI or any \
other handler; this can be a static file if you want to always send people \
to the same entry page when they log in). This login form has fields for \
username and password. On submitting it, the username and password are \
looked up in the DBI database. The supplied password is checked against the \
password in the database; the password in the database can be plaintext, or \
a crypt() or md5_hex() checksum of the password. If this succeeds, the user \
is issued a ticket. This ticket contains the username, an issue time, an \
expire time, and an MD5 checksum of those and a secret key for the server. \
It can optionally be encrypted before returning it to the client in the \
cookie; encryption is only useful for preventing the client from seeing the \
expire time. If you wish to protect passwords in transport, use an \
SSL-encrypted connection. The ticket is given in a cookie that the browser \
stores. \
 \
After a login the user is redirected to the location they originally wished \
to view (or to a fixed page if the login 'script' was really a static \
file). \
 \
On this access and any subsequent attempt to access a protected document, \
the browser returns the ticket to the server. The server unencrypts it if \
encrypted tickets are enabled, then extracts the username, issue time, \
expire time and checksum. A new checksum is calculated of the username, \
issue time, expire time and the secret key again; if it agrees with the \
checksum that the client supplied, we know that the data has not been \
tampered with. We next check that the expire time has not passed. If not, \
the ticket is still good, so we set the username. \
 \
Authorization checks then check that any 'require valid-user' or 'require \
user jacob' settings are passed. Finally, if a 'require group foo' \
directive was given, the module will look up the username in a groups \
database and check that the user is a member of one of the groups listed. \
If all these checks pass, the document requested is displayed. \
 \
If a ticket has expired or is otherwise invalid it is cleared in the \
browser and the login form is shown again."
LICENSE = "LGPL-2.1-or-later"

PV = "2.19"

RPM_NAME = "perl-Apache2-AuthCookieDBI-2.19-1.15.noarch.rpm"
RPM_HASH = "e2db8ec76104fc1afcc6034a6b54869020bfb778165b98ee17cfa28d75d58c598db8478b7daac44bcbfdd19619c289fcf51c7f31fcd4e2a31ab26a4a1f777282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache2--AuthCookieDBI \
perl-Apache2-4--AuthCookieDBI \
perl-Apache2-AuthCookieDBI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Apache2--AuthCookie \
perl-Apache2--Const \
perl-Apache2--RequestRec \
perl-Apache2--ServerUtil \
perl-Crypt--CBC \
perl-DBI \
perl-Date--Calc \
perl-Digest--SHA \
perl-mod-perl2"

inherit rpm
