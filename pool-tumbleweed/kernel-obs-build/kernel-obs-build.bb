SUMMARY = "package kernel and initrd for OBS VM builds"
DESCRIPTION = "This package is repackaging already compiled kernels to make them usable \
inside of Open Build Service (OBS) VM builds. An initrd with some basic \
kernel modules is generated as well, but further kernel modules can be \
loaded during build when installing the kernel package."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-obs-build-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "6b46deb36a85e64511e20932b99a9e26365e36d4dda29a4d118faf4d746556bc2d97f87c02b2dcf241161b09a6596c6902a87f1281b7e28ac0d52bacde018cba"

RPROVIDES:${PN} += "kernel-obs-build"

RDEPENDS:${PN} += ""

inherit rpm
