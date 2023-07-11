SUMMARY = "A Wayland-native application launcher, similar to rofi's drun mode"
DESCRIPTION = "A Wayland-native application launcher, similar to rofi's drun mode."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "fuzzel-1.9.1-2.2.aarch64.rpm"
RPM_HASH = "97358ac33e4bef36aca4e240614d412c9adeca1dc2c5c2373c067e8a3c185a418bc81c6fa1fa580f1d51dd669fc940c11cd3458c3981fd74b6d22124ec6abf8b"

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
