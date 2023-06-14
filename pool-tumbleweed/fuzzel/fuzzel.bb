SUMMARY = "A Wayland-native application launcher, similar to rofi's drun mode"
DESCRIPTION = "A Wayland-native application launcher, similar to rofi's drun mode."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "fuzzel-1.9.1-2.1.aarch64.rpm"
RPM_HASH = "c91df2a3cd6a6763633885d27970f521855aab76a9e8e6c2043ccfe822b04e78f53ce76f7a695695ae0a68661ed54110b935398d23edd6c638b54dcd9261743a"

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
