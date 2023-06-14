SUMMARY = "Perl extension to create simple calendars"
DESCRIPTION = "A very simple module that exports one function called 'calendar'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0.1"

RPM_NAME = "perl-Calendar-Simple-2.0.1-1.10.noarch.rpm"
RPM_HASH = "8629eb4cee94fa5ad38ca5d63ca670b3e322a9d20cfba856f5ef6bbd2d973cb1d4922a158e2c58e2aa14cea8de32cbf09cfa44f2e0e452ff18a7512f49c5b94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Calendar--Simple \
perl-Calendar-Simple"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
