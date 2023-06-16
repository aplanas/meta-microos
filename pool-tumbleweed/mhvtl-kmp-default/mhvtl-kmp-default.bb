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

PV = "1.70_release+865.af13081a1ae5_k6.3.4_1"

RPM_NAME = "mhvtl-kmp-default-1.70_release+865.af13081a1ae5_k6.3.4_1-2.23.aarch64.rpm"
RPM_HASH = "180b509a6773ce5b556091c08ec87b2b21beb4faf6374e7853b5b4c49a61a8d6dc8ab8b9125f9c24550e0d85dbf4bba7fbd1861352625be9a168fabc32898e1f"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-default \
mhvtl-kmp-default-k6.3.4-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
