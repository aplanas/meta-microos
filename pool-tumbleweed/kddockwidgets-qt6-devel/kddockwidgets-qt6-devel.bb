SUMMARY = "Development files for libkddockwidgets"
DESCRIPTION = "Development files for libkddockwidgets"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "kddockwidgets-qt6-devel-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "6aa262c731178bd99d3b220510313ef32adb30737f619b0f6e489e0d0652e270582076b5bbacb081f574c458a67e9afbc8a41c95d4aa4bb98fa9bbe7b9bb814a"

RPROVIDES:${PN} += "cmake(KDDockWidgets-qt6) \
kddockwidgets-qt6-devel \
kddockwidgets-qt6-devel(aarch-64)"

RDEPENDS:${PN} += "libkddockwidgets-qt6-1_7"

inherit rpm
