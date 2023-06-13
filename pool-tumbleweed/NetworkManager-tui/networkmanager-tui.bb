SUMMARY = "NetworkManager curses-based UI"
DESCRIPTION = "This adds a curses-based 'TUI' (Text User Interface) to \
NetworkManager, to allow performing some of the operations supported \
by nm-connection-editor and nm-applet in a non-graphical environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-tui-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "458192b2b280514a566fcc1d5abfa209bd2ad0182b9aa0b150bea472df16793f18871727973e4f35b9ceb288fb0616beda5c54099338856a0c1801092e9e6bce"

RPROVIDES:${PN} += "NetworkManager-tui \
NetworkManager-tui(aarch-64)"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnewt.so.0.52()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_10_0)(64bit) \
libnm.so.0(libnm_1_10_2)(64bit) \
libnm.so.0(libnm_1_12_0)(64bit) \
libnm.so.0(libnm_1_14_0)(64bit) \
libnm.so.0(libnm_1_16_0)(64bit) \
libnm.so.0(libnm_1_18_0)(64bit) \
libnm.so.0(libnm_1_20_0)(64bit) \
libnm.so.0(libnm_1_22_0)(64bit) \
libnm.so.0(libnm_1_24_0)(64bit) \
libnm.so.0(libnm_1_26_0)(64bit) \
libnm.so.0(libnm_1_28_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libnm.so.0(libnm_1_30_0)(64bit) \
libnm.so.0(libnm_1_34_0)(64bit) \
libnm.so.0(libnm_1_40_0)(64bit) \
libnm.so.0(libnm_1_42_0)(64bit) \
libnm.so.0(libnm_1_4_0)(64bit) \
libnm.so.0(libnm_1_6_0)(64bit) \
libnm.so.0(libnm_1_8_0)(64bit) \
libnm0"

inherit rpm
