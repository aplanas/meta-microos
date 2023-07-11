SUMMARY = "Qt5 Virtual Keyboard library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support."
LICENSE = "GPL-3.0"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5VirtualKeyboard5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "5d6d6371f2e36af2f53cfd5df9c481c4660b5d94000e17d96ece0dd98bad2d52cbdc4b7121c6996baf7b2486df8ece43d4a5cad7cfef60811f0018b1be075450"

RPROVIDES:${PN} += "libQt5VirtualKeyboard.so.5 \
libQt5VirtualKeyboard5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
