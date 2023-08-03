SUMMARY = "Development files for the Qt 6 HunspellInputMethod library"
DESCRIPTION = "Development files for the Qt 6 HunspellInputMethod library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-hunspellinputmethod-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "aae1937a19e10261535ebfdaf50b07deac4424f8a058b3799227de96d32aab38898e196b0f52b900cc922070786c8401ea7a9f8721db322fb510938c2135091d"

RPROVIDES:${PN} += "cmake-Qt6HunspellInputMethod \
qt6-hunspellinputmethod-devel \
qt6-hunspellinputmethod-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
cmake-Qt6VirtualKeyboard \
libQt6HunspellInputMethod6"

inherit rpm
