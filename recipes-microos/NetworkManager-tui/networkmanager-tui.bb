SUMMARY = "NetworkManager curses-based UI"
DESCRIPTION = "This adds a curses-based 'TUI' (Text User Interface) to \
NetworkManager, to allow performing some of the operations supported \
by nm-connection-editor and nm-applet in a non-graphical environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-tui-1.42.6-1.1.aarch64.rpm"
RPM_HASH = "8816acad112e2a4d24efae211aa42fc7171cbe5c326c9c493bbf335aa76de19b630e25464301f49ee5b1c66dda5e7a635b1a7cc5bd5e6961fbde12cfd4fac86a"

RPROVIDES:${PN} += "NetworkManager-tui NetworkManager-tui(aarch-64)"
RDEPENDS:${PN} += "NetworkManager ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libnewt.so.0.52()(64bit) libnewt.so.0.52(NEWT_0.52)(64bit) libnewt.so.0.52(NEWT_0.52.13)(64bit) libnewt.so.0.52(NEWT_0.52.6)(64bit) libnewt.so.0.52(NEWT_0.52.9)(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_10_0)(64bit) libnm.so.0(libnm_1_10_2)(64bit) libnm.so.0(libnm_1_12_0)(64bit) libnm.so.0(libnm_1_14_0)(64bit) libnm.so.0(libnm_1_16_0)(64bit) libnm.so.0(libnm_1_18_0)(64bit) libnm.so.0(libnm_1_20_0)(64bit) libnm.so.0(libnm_1_22_0)(64bit) libnm.so.0(libnm_1_24_0)(64bit) libnm.so.0(libnm_1_26_0)(64bit) libnm.so.0(libnm_1_28_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libnm.so.0(libnm_1_30_0)(64bit) libnm.so.0(libnm_1_34_0)(64bit) libnm.so.0(libnm_1_40_0)(64bit) libnm.so.0(libnm_1_42_0)(64bit) libnm.so.0(libnm_1_4_0)(64bit) libnm.so.0(libnm_1_6_0)(64bit) libnm.so.0(libnm_1_8_0)(64bit) libnm0"

inherit rpm
