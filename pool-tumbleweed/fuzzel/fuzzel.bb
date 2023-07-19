SUMMARY = "A Wayland-native application launcher, similar to rofi's drun mode"
DESCRIPTION = "A Wayland-native application launcher, similar to rofi's drun mode."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "fuzzel-1.9.2-1.1.aarch64.rpm"
RPM_HASH = "edbae1caa4dedb94e1d45b8b152c46bb9e73496d0b1ad9c40151e90b10c6e9c68ec3f2f5738fd7a01705f238f72322f6dd61117aa22a666b78648e9059b5870c"

RPROVIDES:${PN} += "config-fuzzel \
fuzzel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfcft.so.4 \
libfontconfig.so.1 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
