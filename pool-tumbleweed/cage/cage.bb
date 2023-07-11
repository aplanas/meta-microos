SUMMARY = "Wayland Kiosk"
DESCRIPTION = "A Wayland Kiosk."
LICENSE = "MIT"

PV = "0.1.4+39.a81ab70"

RPM_NAME = "cage-0.1.4+39.a81ab70-1.3.aarch64.rpm"
RPM_HASH = "b406e3cbd8ec21ff053497202a49327423f7082496aed5bc52baaabaf32807575d58b1563560c9d0f629ad51c3208c90ce26f111b363c41aeee26f02d9f882cc"

RPROVIDES:${PN} += "cage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-server.so.0 \
libwlroots.so.11 \
libxkbcommon.so.0"

inherit rpm
