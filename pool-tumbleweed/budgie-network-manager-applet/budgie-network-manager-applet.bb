SUMMARY = "Network manager applet"
DESCRIPTION = "This is a fork of Wingpanel Network Indicator, ported to budgie desktop"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-network-manager-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "600528a7563375aa768fa7a157bd2140e1051e3ecc3729b8a68f9be18231a2fa8b991c2278165b6ac7020467dbae94e7d0adfcaf8bc7fc31eb85554a0db3d9c1"

RPROVIDES:${PN} += "budgie-network-manager-applet \
budgie-network-manager-applet(aarch-64) \
libnetworkapplet.so()(64bit)"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1()(64bit) \
libbudgie-plugin.so.0()(64bit) \
libc.so.6()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libpeas-1.0.so.0()(64bit)"

inherit rpm
