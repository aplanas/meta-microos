SUMMARY = "Lightweight notification daemon for Wayland"
DESCRIPTION = "Lightweight notification daemon for Wayland."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "fnott-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "ead7bde3747b65181f970b21ec0fcbf253d7e6ee4a0e45d99434fa60a41afe9ff3ef94beb46dade569664c2e1ff27e0e41efec4243bb6a9ddf06db5cb276e3b1"

RPROVIDES:${PN} += "fnott"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfcft.so.4 \
libfontconfig.so.1 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
