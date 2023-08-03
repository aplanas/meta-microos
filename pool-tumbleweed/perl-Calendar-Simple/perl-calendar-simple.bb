SUMMARY = "Perl extension to create simple calendars"
DESCRIPTION = "A very simple module that exports one function called 'calendar'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0.2"

RPM_NAME = "perl-Calendar-Simple-2.0.2-1.1.noarch.rpm"
RPM_HASH = "458f4116a7892b7cd9176cea02301f77888723bbb2be42d48b643fe7d6e45795704edc140f58047a12b91ef345ca9ff96cd3d95e64094644b1e16295589ce183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Calendar--Simple \
perl-Calendar-Simple"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
