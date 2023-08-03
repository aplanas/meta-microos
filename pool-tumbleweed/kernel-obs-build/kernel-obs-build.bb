SUMMARY = "package kernel and initrd for OBS VM builds"
DESCRIPTION = "This package is repackaging already compiled kernels to make them usable \
inside of Open Build Service (OBS) VM builds. An initrd with some basic \
kernel modules is generated as well, but further kernel modules can be \
loaded during build when installing the kernel package."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-obs-build-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "ee6984b3123999e4178bde36596abc7c63ccd1536c50ee7955778c4a054b328faa9062910204cf18313007c02d353a1fd6eba577ca333b5d01cf534c73426bd1"

RPROVIDES:${PN} += "kernel-obs-build"

RDEPENDS:${PN} += ""

inherit rpm
