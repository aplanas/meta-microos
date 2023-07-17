SUMMARY = "Development files for the Qt 6 HunspellInputMethod library"
DESCRIPTION = "Development files for the Qt 6 HunspellInputMethod library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-hunspellinputmethod-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b2a50a780548a8b1c30aaf5abd3f53f21d36b73a8334ec3cfc5198c21f27d24a4506819ff4858dc0d80a205afdddd7c2688a2500efdfea2d35117d264e57a127"

RPROVIDES:${PN} += "cmake-Qt6HunspellInputMethod \
qt6-hunspellinputmethod-devel \
qt6-hunspellinputmethod-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
cmake-Qt6VirtualKeyboard \
libQt6HunspellInputMethod6"

inherit rpm
