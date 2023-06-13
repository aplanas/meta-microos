SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.3.4_1"

RPM_NAME = "vhba-kmp-64kb-20211218_k6.3.4_1-3.5.aarch64.rpm"
RPM_HASH = "538c9a70aec3e32b080ef41fb34f106c458b688a2ced0a0c587d469f23261f2588f66373aa8abaa41daa85f23bb9f35650b6679ae98bc9f15b50519ad86e1611"

RPROVIDES:${PN} += "kmod(vhba.ko) \
multiversion(kernel) \
vhba-kmp \
vhba-kmp-64kb \
vhba-kmp-64kb(aarch-64) \
vhba-kmp-64kb-k6.3.4_1"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
