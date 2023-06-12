SUMMARY = "Development tools for deepin dock"
DESCRIPTION = "The deepin-dock-devel package contains the header files for deepin-dock."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.65"

RPM_NAME = "deepin-dock-devel-5.5.65-1.3.aarch64.rpm"
RPM_HASH = "e3fa96463340c3b40cc1742a074161f22dbeac10bf655130c924e1e0518c8d5be2b4002f9e82c9552ba11b441b9400fe123f86123812f7118580cb84a2979e45"

RPROVIDES:${PN} += "cmake(DdeDock) \
deepin-dock-devel \
deepin-dock-devel(aarch-64) \
pkgconfig(dde-dock)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
