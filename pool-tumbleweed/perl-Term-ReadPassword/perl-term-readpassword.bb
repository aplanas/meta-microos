SUMMARY = "Term::ReadPassword - Asking the user for a password"
DESCRIPTION = "This module lets you ask the user for a password in the traditional \
way, from the keyboard, without echoing. \
 \
This is not intended for use over the web; user authentication over the \
web is another matter entirely. Also, this module should generally be \
used in conjunction with Perl's crypt() function, sold separately. \
 \
 \
 \
Authors: \
-------- \
    Tom Phoenix <rootbeer@redcat.com>"
LICENSE = "Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Term-ReadPassword-0.11-69.30.aarch64.rpm"
RPM_HASH = "c08a186d9bae5bd4f285dd8d4d8c4f3f5ee27afa059458ec0637fab152cc5cad97aee96f6785c1bb3b82cd794f07fcaffc5e17d29c0bfdef50978c1340147fd3"

RPROVIDES:${PN} += "perl-Term--ReadPassword \
perl-Term-ReadPassword"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
