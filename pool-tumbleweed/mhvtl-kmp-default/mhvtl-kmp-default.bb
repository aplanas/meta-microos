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

RPM_NAME = "mhvtl-kmp-default-1.71_release+903.d3ec98550dc3_k6.4.6_1-1.1.aarch64.rpm"
RPM_HASH = "a562e68f85dbe381d6c211b1a341c1848f5faa773f28dbda002f4356e4a3d098c06bd32b56a4b9a53dff64bf7ae1388afca73eb7661de0e4f39911c87077d771"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-default \
mhvtl-kmp-default-k6.4.6-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
