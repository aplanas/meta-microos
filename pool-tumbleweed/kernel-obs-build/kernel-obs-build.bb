SUMMARY = "package kernel and initrd for OBS VM builds"
DESCRIPTION = "This package is repackaging already compiled kernels to make them usable \
inside of Open Build Service (OBS) VM builds. An initrd with some basic \
kernel modules is generated as well, but further kernel modules can be \
loaded during build when installing the kernel package."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-obs-build-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "f4e2c2bbe0b746d9a7cd4a06a6badd3aca7772a6c3c22a4c2538ff1d46e26238a1b182bfaf9628d7332e44e900f8deb054d5944b1a0e3b663a96655b67f39353"

RPROVIDES:${PN} += "kernel-obs-build \
kernel-obs-build(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
