SUMMARY = "Utility to manage outputs of a Wayland compositor"
DESCRIPTION = "wlr-randr is a command line utility to manage outputs of a Wayland compositor."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "wlr-randr-0.2.0-1.12.aarch64.rpm"
RPM_HASH = "392d7c56f5615d644792ff9b0847020216b9bb91fa846547e32c049fdc212ca266808bc7ec721c61ee60263b19f5cda05ad62d487c770ed186e4a8c33acc00d0"

RPROVIDES:${PN} += "wlr-randr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
