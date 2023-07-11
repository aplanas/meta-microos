SUMMARY = "UI for IRQ balance Daemon"
DESCRIPTION = "Text UI for the IRQ balance daemon."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.2.24.git+184c950"

RPM_NAME = "irqbalance-ui-1.9.2.24.git+184c950-1.1.aarch64.rpm"
RPM_HASH = "7ab5e912d3aebde24006603ddacd3b37bc4cffc8f360f7bbc84c2459f8934cfb7a3f6ace76913bb5d79a92f4acf9a90172b39e9f790801ae699026ca02e6883f"

RPROVIDES:${PN} += "irqbalance-ui"

RDEPENDS:${PN} += "irqbalance \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
