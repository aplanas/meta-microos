SUMMARY = "A Wayland terminal emulator"
DESCRIPTION = "A Wayland terminal emulator."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "foot-1.14.0-2.1.aarch64.rpm"
RPM_HASH = "2cb12e2f4f75470d7d76fcf09137280850826880acb92afb654ecb7d356545dd830267938b750f531ec9174e228013fdda1ae4dcdb6151196ec1e8f853c9b771"

RPROVIDES:${PN} += "application() \
application(org.codeberg.dnkl.foot-server.desktop) \
application(org.codeberg.dnkl.foot.desktop) \
application(org.codeberg.dnkl.footclient.desktop) \
foot \
foot(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfcft.so.4()(64bit) \
libfontconfig.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpixman-1.so.0()(64bit) \
libutf8proc.so.2()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0(V_0.6.0)(64bit) \
libxkbcommon.so.0(V_0.7.0)(64bit) \
libxkbcommon.so.0(V_0.8.0)(64bit) \
libxkbcommon.so.0(V_1.0.0)(64bit) \
terminfo \
utempter"

inherit rpm
