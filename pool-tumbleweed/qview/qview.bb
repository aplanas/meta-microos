SUMMARY = "Practical and minimal image viewer"
DESCRIPTION = "qView is a Qt image viewer designed with minimalism and usability in mind. \
No cluttered interface, just your image and a titlebar."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "qview-5.0-1.7.aarch64.rpm"
RPM_HASH = "3e7f2eeee7bec6ae359c01cd7b28799a910ea920026bef6af7543fc1c9c628da38fe88f999f0d8b5366e4ae0abc7beb99465c4bcb8755ddc90e8a509648dec63"

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
