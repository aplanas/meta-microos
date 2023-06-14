SUMMARY = "Small utility to dump info about DRM devices"
DESCRIPTION = "Small utility to dump info about DRM devices."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "drm_info-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "a69e9cb6e45439841c986288855f54c0d3968ef86dac7eb2ed5df16cf77af07b8003220a6b8c1539ab3e25a931bffe9aa5fec7763eed16cbeba136f845a23977"

RPROVIDES:${PN} += "drm-info"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libjson-c.so.5 \
libpci.so.3"

inherit rpm
