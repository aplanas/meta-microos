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

RPM_NAME = "mhvtl-kmp-default-1.71_release+903.d3ec98550dc3_k6.4.11_1-1.4.aarch64.rpm"
RPM_HASH = "41db22f2c8cc300dc2b0a257725fb88c78b103e965376a0d012d11255e76edd5c1d3e710c1a8aba746af946563a4cfcb68e45527be0d9e51f3518c039414c9d7"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-default \
mhvtl-kmp-default-k6.4.11-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
