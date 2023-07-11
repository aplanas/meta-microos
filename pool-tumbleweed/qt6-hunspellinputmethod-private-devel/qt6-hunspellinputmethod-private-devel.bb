SUMMARY = "Development files for the Qt 6 HunspellInputMethod library"
DESCRIPTION = "Development files for the Qt 6 HunspellInputMethod library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-hunspellinputmethod-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7f441b39d3acd60e01c1bb2343f802ce23363256fb984c69f68be3453c4d38dae3e0930252def26bef36966ed186f37394b706ab07bd865410cbf4aa4126b843"

RPROVIDES:${PN} += "cmake-Qt6HunspellInputMethod \
qt6-hunspellinputmethod-devel \
qt6-hunspellinputmethod-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libQt6HunspellInputMethod6 \
qt6-virtualkeyboard-private-devel"

inherit rpm
