SUMMARY = "Wayland event viewer"
DESCRIPTION = "This is a tool for debugging events on a Wayland window, analagous to \
the X11 tool xev."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "wev-1.0.0-1.12.aarch64.rpm"
RPM_HASH = "b9575344930a1aef94758abf48ba527b06419f9427312ea6e472b0585550a02de249aa1ed1be4e73cb3fe7c026f4574654f86bd8f4390dfdd9a79e1adfdc5a25"

RPROVIDES:${PN} += "wev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
