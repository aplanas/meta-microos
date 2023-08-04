SUMMARY = "Wayland Kiosk"
DESCRIPTION = "A Wayland Kiosk."
LICENSE = "MIT"

PV = "0.1.5+0.83ffc57"

RPM_NAME = "cage-0.1.5+0.83ffc57-1.1.aarch64.rpm"
RPM_HASH = "eb637448ab6bf0e18247631da159f4ce90ad5d3da56d1b3357e5654c35edd80b8818ebe0d9ba935d32cd1bc766928844bc16abb2c6dbc271866e46d0c7791e78"

RPROVIDES:${PN} += "cage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-server.so.0 \
libwlroots.so.11 \
libxkbcommon.so.0"

inherit rpm
