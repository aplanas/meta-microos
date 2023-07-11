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

PV = "1.70_release+865.af13081a1ae5_k6.3.9_1"

RPM_NAME = "mhvtl-kmp-default-1.70_release+865.af13081a1ae5_k6.3.9_1-2.29.aarch64.rpm"
RPM_HASH = "fb345520b29210734dad6b4e46a1779afbdd0c691339e83ab2ff4a49fe8953f9771e61b74a0c61ab065deab5a4c554dd9206fec57a60c4acdb207b180e66f100"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-default \
mhvtl-kmp-default-k6.3.9-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
