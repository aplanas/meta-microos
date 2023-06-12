SUMMARY = "A Wayland-native application launcher, similar to rofi's drun mode"
DESCRIPTION = "A Wayland-native application launcher, similar to rofi's drun mode."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "fuzzel-1.9.1-2.1.aarch64.rpm"
RPM_HASH = "c91df2a3cd6a6763633885d27970f521855aab76a9e8e6c2043ccfe822b04e78f53ce76f7a695695ae0a68661ed54110b935398d23edd6c638b54dcd9261743a"

RPROVIDES:${PN} += "config(fuzzel) \
fuzzel \
fuzzel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfcft.so.4()(64bit) \
libfontconfig.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpixman-1.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0(V_0.7.0)(64bit) \
libxkbcommon.so.0(V_1.0.0)(64bit)"

inherit rpm
