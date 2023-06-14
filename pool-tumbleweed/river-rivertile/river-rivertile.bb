SUMMARY = "Tiled layout generator for river"
DESCRIPTION = "A layout generator for river. It provides a simple tiled layout with split main/secondary stacks. \
The initial state may be configured with various options passed on startup. Some values may additionally be modified while rivertile is running with the help of riverctl."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g109"

RPM_NAME = "river-rivertile-0.2.4+g109-3.1.aarch64.rpm"
RPM_HASH = "4d76eb141696d9504e8d0a9c7cc895db9a439cdb1eee6edf8d55c9ae7515705c9ede250828f5ec6ad0229470873ab7899204bbc7a0707ea764667ad302624f24"

RPROVIDES:${PN} += "river-rivertile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
river"

inherit rpm
