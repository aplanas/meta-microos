SUMMARY = "Small utility to dump info about DRM devices"
DESCRIPTION = "Small utility to dump info about DRM devices."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "drm_info-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "a69e9cb6e45439841c986288855f54c0d3968ef86dac7eb2ed5df16cf77af07b8003220a6b8c1539ab3e25a931bffe9aa5fec7763eed16cbeba136f845a23977"

RPROVIDES:${PN} += "drm_info \
drm_info(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libpci.so.3()(64bit) \
libpci.so.3(LIBPCI_3.0)(64bit) \
libpci.so.3(LIBPCI_3.5)(64bit)"

inherit rpm
