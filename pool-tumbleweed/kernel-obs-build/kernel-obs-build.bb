SUMMARY = "package kernel and initrd for OBS VM builds"
DESCRIPTION = "This package is repackaging already compiled kernels to make them usable \
inside of Open Build Service (OBS) VM builds. An initrd with some basic \
kernel modules is generated as well, but further kernel modules can be \
loaded during build when installing the kernel package."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-obs-build-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "faae3c871f4651d69fd4099e4210afcc40f62e18c560b635bfa71722acc3242cc6bf6fcfdfdd41ac264bbadf9c8b860d8c996e29c18e5a14fcdfd3e9094168df"

RPROVIDES:${PN} += "kernel-obs-build"

RDEPENDS:${PN} += ""

inherit rpm
