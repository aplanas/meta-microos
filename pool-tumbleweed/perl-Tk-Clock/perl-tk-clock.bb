SUMMARY = "Clock widget with analog and digital display"
DESCRIPTION = "This module implements a Canvas-based clock widget for perl-Tk with lots of \
options to change the appearance. \
 \
Both analog and digital clocks are implemented."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.44"

RPM_NAME = "perl-Tk-Clock-0.44-1.2.noarch.rpm"
RPM_HASH = "d72c2445ddac0d4140cfd8824b2fd096846dcd571002bb21cda5670db3c39855f0a0cc2bd01b827c56591688673514063e8c3a190d0fc3f1debc963f60fb46c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tk--Clock \
perl-Tk-Clock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--More \
perl-Test--NoWarnings \
perl-Tk \
perl-Tk--Canvas \
perl-Tk--Derived \
perl-Tk--Widget"

inherit rpm
