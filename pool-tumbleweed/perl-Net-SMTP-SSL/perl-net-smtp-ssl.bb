SUMMARY = "SSL support for Net::SMTP"
DESCRIPTION = "Implements the same API as Net::SMTP, but uses IO::Socket::SSL for its \
network operations. Due to the nature of 'Net::SMTP''s 'new' method, it is \
not overridden to make use of a default port for the SMTPS service. Perhaps \
future versions will be smart like that. Port '465' is usually what you \
want, and it's not a pain to specify that. \
 \
For interface documentation, please see Net::SMTP."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Net-SMTP-SSL-1.04-1.24.noarch.rpm"
RPM_HASH = "7e095c08743063ef4b91a269ffc04aa700ee243b125fb6949831a4ddd271c5e425afff652d40c3e749b6d6b8e2cc7e1c7547a2cd1443b251a46e2371a65df481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--SMTP--SSL \
perl-Net-SMTP-SSL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--Socket--SSL"

inherit rpm
