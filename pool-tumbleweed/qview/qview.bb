SUMMARY = "Practical and minimal image viewer"
DESCRIPTION = "qView is a Qt image viewer designed with minimalism and usability in mind. \
No cluttered interface, just your image and a titlebar."
LICENSE = "GPL-3.0-only"

PV = "6.1"

RPM_NAME = "qview-6.1-1.1.aarch64.rpm"
RPM_HASH = "3721d17c4f95d8ba7152a39fb1ec2252eafd60759cb2fff881c3441d7fe0978b7313b18b3ac7a3c99903ad921ea0ac4fcaab1316e1a19e04ad7bec7ab5e86981"

RPROVIDES:${PN} += "qview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
