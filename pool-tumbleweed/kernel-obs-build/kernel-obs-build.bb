SUMMARY = "package kernel and initrd for OBS VM builds"
DESCRIPTION = "This package is repackaging already compiled kernels to make them usable \
inside of Open Build Service (OBS) VM builds. An initrd with some basic \
kernel modules is generated as well, but further kernel modules can be \
loaded during build when installing the kernel package."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-obs-build-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "5af708ed71be906c57fd9e280a34d7f17a810983e492386bb060aaae7ddb2c35968cbc02e731f0a85b33974d1947acefa83978860765aed782452e741e00b840"

RPROVIDES:${PN} += "kernel-obs-build"

RDEPENDS:${PN} += ""

inherit rpm
