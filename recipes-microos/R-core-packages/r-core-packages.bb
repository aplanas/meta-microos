SUMMARY = "Metapackage, requires all core Packages"
DESCRIPTION = "Metapackage, Requires: all core Packages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-packages-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "acbe4d78506f64108f27c8cc84bb0c04319fb4ba96676368a8defe61e11075bf2734f38c5a79ec19d9c1bb7201a0ffde97627bb6e85bdbcc0eba3d4d981069f1"

RPROVIDES:${PN} += "R-core-packages R-core-packages(aarch-64)"
RDEPENDS:${PN} += "R-compiler R-datasets R-grDevices R-graphics R-grid R-methods R-parallel R-splines R-stats R-stats4 R-tcltk R-tools R-utils"

inherit rpm
