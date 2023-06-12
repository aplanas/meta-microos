SUMMARY = "Development files for libkddockwidgets"
DESCRIPTION = "Development files for libkddockwidgets"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "kddockwidgets-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "66c3ecc64227d8224da547d168052f18321f2295bc5bdaf9e4b4b32a8f9789f033f529dc1ce28b9b918f37d0e593c4c39a94bef8c2e497f4fb0b95624976b785"

RPROVIDES:${PN} += "cmake(KDDockWidgets) \
kddockwidgets-devel \
kddockwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5X11Extras) \
libkddockwidgets1_7"

inherit rpm
