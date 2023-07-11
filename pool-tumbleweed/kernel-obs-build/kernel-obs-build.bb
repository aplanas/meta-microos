SUMMARY = "package kernel and initrd for OBS VM builds"
DESCRIPTION = "This package is repackaging already compiled kernels to make them usable \
inside of Open Build Service (OBS) VM builds. An initrd with some basic \
kernel modules is generated as well, but further kernel modules can be \
loaded during build when installing the kernel package."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-obs-build-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "9b2a05d03ea22b4d8272d641e2c285d9c75a671bf1d7deacd0e114699859e326bbb15674c4fbdfa5f234b33d5bbb2a6f652ed7de9476c03254a3179bc5c89a95"

RPROVIDES:${PN} += "kernel-obs-build"

RDEPENDS:${PN} += ""

inherit rpm
