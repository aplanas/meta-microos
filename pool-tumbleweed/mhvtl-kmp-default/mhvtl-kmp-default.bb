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

RPM_NAME = "mhvtl-kmp-default-1.71_release+903.d3ec98550dc3_k6.4.12_1-1.5.aarch64.rpm"
RPM_HASH = "f4f94a415ef42fed1955855c47f427e3ace165b4597cce7fc8bab0f152836cf06d424bfb83bf434ed5aff9c9580b16b8573d2f43562a199d724e367cd6311a39"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-default \
mhvtl-kmp-default-k6.4.12-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
