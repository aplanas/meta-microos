SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.3.4_1"

RPM_NAME = "vhba-kmp-default-20211218_k6.3.4_1-3.5.aarch64.rpm"
RPM_HASH = "ca37ebdea3b08c2d173377821149ccae7dd2d0831d7ac8247454b148b96ac067eb79b7c334b767928c4323cebabc6168bdff04040008221443fea373aca6a33b"

RPROVIDES:${PN} += "kmod(vhba.ko) \
multiversion(kernel) \
vhba-kmp \
vhba-kmp-default \
vhba-kmp-default(aarch-64) \
vhba-kmp-default-k6.3.4_1"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
