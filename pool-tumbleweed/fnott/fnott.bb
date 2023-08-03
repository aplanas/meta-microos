SUMMARY = "Lightweight notification daemon for Wayland"
DESCRIPTION = "Lightweight notification daemon for Wayland."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "fnott-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "1d6544c952ef3ad577d94009ee8d4d0fc103d820255b75747f0f75a12a3823b0f744b9f712d1a1626bf1e7a457131b446df0def9fea8929d037af655e840a891"

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
