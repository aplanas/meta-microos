SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libqmobipocket2-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "85db7e6e086a755aced8003a6c684887d4a14857a8613174b282c389dd41e0aa7b95c61283bea20902e862ef7c403c2a8d737e3757c7287529bbb00166f8cd0b"

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
