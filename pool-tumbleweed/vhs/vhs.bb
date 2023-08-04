SUMMARY = "CLI video recorder"
DESCRIPTION = "VHS records your terminal as videos or gifs for demos."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "vhs-0.6.0-1.2.aarch64.rpm"
RPM_HASH = "3c5c05d40c95c98e0c7ca86a71db4ec335dd287440f91ea45258805e7e9fd86f53dda50c64641a9190032cad8878e5fb311068225acc3bb32bfae425c6e072d9"

RPROVIDES:${PN} += "vhs"

RDEPENDS:${PN} += "ffmpeg \
libc.so.6 \
ttyd"

inherit rpm
