SUMMARY = "Scan files for digital TV applications v5"
DESCRIPTION = "Scan data needed for some scanning applications from dvb package and maybe \
others. This package contains v5 of the files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "20221125"

RPM_NAME = "dtv-scan-tables-v5-20221125-1.2.noarch.rpm"
RPM_HASH = "b39c0551d16c8e4ee5510c3cf956db9a78321adc0586fc632f666fc8c04b8df291622b0cc510fe38ac053a70a43b7f681d183ee548c0913ea928b72efa34b0b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtv-scan-tables-v5"
RDEPENDS:${PN} += ""

inherit rpm
