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

RPM_NAME = "perl-Term-ReadPassword-0.11-69.31.aarch64.rpm"
RPM_HASH = "35576ecd162bcadbdf259a6fce4951448a681401298b8c8eedc176bedfc61c2d88def3ff7102a88c27e7c4fc02d4149b67000266c60d3b3879b5b9971384d6ca"

RPROVIDES:${PN} += "perl-Term--ReadPassword \
perl-Term-ReadPassword"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
