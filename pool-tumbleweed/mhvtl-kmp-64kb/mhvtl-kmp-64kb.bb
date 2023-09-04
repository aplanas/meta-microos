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

PV = "1.71_release+903.d3ec98550dc3_k6.4.11_1"

RPM_NAME = "mhvtl-kmp-64kb-1.71_release+903.d3ec98550dc3_k6.4.11_1-1.4.aarch64.rpm"
RPM_HASH = "7c62e1075c3aad34e156f5671bb677aa993ffdc11a50d6f09d90614b74e0c1dc97adec0482426d50d6615694567d97d72fbf220507e3006862512982eaae4adb"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-64kb \
mhvtl-kmp-64kb-k6.4.11-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
