SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libqmobipocket2-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0f1df211f4337675ce7f85fa4ae88f1db87d6ced1fcc18bc6700ad8f6dd4da28f71ed53a5c2de5b8820f9a4aa3568ca16198e21b869723e01e9b14da06db913f"

RPROVIDES:${PN} += "libqmobipocket.so.2 \
libqmobipocket2 \
mobipocket"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
