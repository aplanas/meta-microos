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

RPM_NAME = "mhvtl-kmp-64kb-1.70_release+865.af13081a1ae5_k6.3.4_1-2.23.aarch64.rpm"
RPM_HASH = "f6cc73db18ab7eb2d7c035211f99dd4fc8c6d99f28807dfe1971c02fd36f22f583dc813db7ac41a32ffc8a9e7eb3bbd3664c09fe045d4b982037b2f3c00988bd"

RPROVIDES:${PN} += "kmod(mhvtl.ko) \
mhvtl-kmp \
mhvtl-kmp-64kb \
mhvtl-kmp-64kb(aarch-64) \
mhvtl-kmp-64kb-k6.3.4_1 \
multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
