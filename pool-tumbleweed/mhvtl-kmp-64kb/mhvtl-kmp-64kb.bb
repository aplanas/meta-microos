SUMMARY = "Virtual Tape Library kernel module"
DESCRIPTION = "This is the kernel module package for the mhvtl Virtual Tape & \
Library package. \
 \
This works in conjunction with the user-land commands and libraries \
to enable tape emulation. \
 \
The vtl module is a stripped-down derivative of the scsi_debug kernel \
module, plus a character device 'back end' to pass the SCSI commands \
through to user-space daemons."
LICENSE = "GPL-2.0-only"

PV = "1.71_release+903.d3ec98550dc3_k6.4.6_1"

RPM_NAME = "mhvtl-kmp-64kb-1.71_release+903.d3ec98550dc3_k6.4.6_1-1.1.aarch64.rpm"
RPM_HASH = "b17610bd78ad97d359692287e51879f7da07e4d922b48251d47b97e0a6a98f4ae428616cf1301259f8f031bdbccf4d3a1f4d01e96b90b0e58a4869bf2ba6f7ce"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-64kb \
mhvtl-kmp-64kb-k6.4.6-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
