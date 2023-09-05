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

PV = "1.71_release+903.d3ec98550dc3_k6.4.12_1"

RPM_NAME = "mhvtl-kmp-64kb-1.71_release+903.d3ec98550dc3_k6.4.12_1-1.5.aarch64.rpm"
RPM_HASH = "653324404ff46e64e68b468b439dc0a32c15983f7d437312320328e34790a63c0d10fbec3c11a9c3c01c2638e6229b506a87437f6c59d89339e34e9b80f73806"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-64kb \
mhvtl-kmp-64kb-k6.4.12-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
