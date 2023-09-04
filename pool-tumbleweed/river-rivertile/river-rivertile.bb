SUMMARY = "Tiled layout generator for river"
DESCRIPTION = "A layout generator for river. It provides a simple tiled layout with split main/secondary stacks. \
The initial state may be configured with various options passed on startup. Some values may additionally be modified while rivertile is running with the help of riverctl."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-rivertile-0.2.4+g953-2.1.aarch64.rpm"
RPM_HASH = "c08df0999232ab256d3d1ddca33a809512a11f6e12f79f37be22a666d3fecece49be8d9c7fe78e8fbf865daab3c8dc9c9c51a9242117a9d99faa256179ff12c9"

RPROVIDES:${PN} += "river-rivertile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
river"

inherit rpm
