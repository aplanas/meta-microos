SUMMARY = "Practical and minimal image viewer"
DESCRIPTION = "qView is a Qt image viewer designed with minimalism and usability in mind. \
No cluttered interface, just your image and a titlebar."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "qview-5.0-1.8.aarch64.rpm"
RPM_HASH = "2ea65520580bfd97cc3664672287540ad197120dce4eefd730004caaf3e572bd024c898f44560527a3fc1118b06284d2c6ac81fde7d9edb95ecdda6b20705e3d"

RPROVIDES:${PN} += "qview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
