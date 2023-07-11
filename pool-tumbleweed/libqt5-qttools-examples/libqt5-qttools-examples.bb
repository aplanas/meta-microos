SUMMARY = "Qt5 tools examples"
DESCRIPTION = "Examples for the libqt5-qttools module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qttools-examples-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "21aa5cc073c73b814a47389b2a587e3dc2aa9e237a513714e168932e3335a1b2403aa3ef3af2b518716b2d344c16a7b3ff693eb4063cfe158c1c59a39699ea12"

RPROVIDES:${PN} += "libqt5-qttools-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
