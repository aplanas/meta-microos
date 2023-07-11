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

RPM_NAME = "mhvtl-kmp-64kb-1.70_release+865.af13081a1ae5_k6.3.9_1-2.29.aarch64.rpm"
RPM_HASH = "437cd66ffcd9c94caf1d38f79b8a96b10ae4b9d748bb2ffed8f0506798ac5e03cb9f173e1c89ba1adb9ef190f72ee2f2d491a32a129ee59547d3dcfcd118689c"

RPROVIDES:${PN} += "kmod-mhvtl.ko \
mhvtl-kmp \
mhvtl-kmp-64kb \
mhvtl-kmp-64kb-k6.3.9-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
