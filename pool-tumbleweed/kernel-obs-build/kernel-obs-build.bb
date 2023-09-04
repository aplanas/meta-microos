SUMMARY = "package kernel and initrd for OBS VM builds"
DESCRIPTION = "This package is repackaging already compiled kernels to make them usable \
inside of Open Build Service (OBS) VM builds. An initrd with some basic \
kernel modules is generated as well, but further kernel modules can be \
loaded during build when installing the kernel package."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-obs-build-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "81b15cb71a64cb12308b878caf4514ff5f4499ba07d9467082d0d0fa3ea1b922211360296fa43c8ffce40ebdbb04ac0f035a84313ec852a9060c6726493f2eae"

RPROVIDES:${PN} += "kernel-obs-build"

RDEPENDS:${PN} += ""

inherit rpm
