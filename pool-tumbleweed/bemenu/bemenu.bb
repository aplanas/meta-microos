SUMMARY = "Dynamic menu library and client program inspired by dmenu"
DESCRIPTION = "Dynamic menu library and client program inspired by dmenu with support \
for X, Wayland and ncurses."
LICENSE = "MIT"

PV = "0.6.15"

RPM_NAME = "bemenu-0.6.15-1.1.aarch64.rpm"
RPM_HASH = "0ddfd54d2483111e3b2cd693f2d2de1155c67efa028373150e646e783ddb55cad14e7505907558e86fb74dfadcfbf2c217fc33464696abf13820ebb50fded1e0"

RPROVIDES:${PN} += "bemenu \
bemenu(aarch-64)"
RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libbemenu.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libwayland-client.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
