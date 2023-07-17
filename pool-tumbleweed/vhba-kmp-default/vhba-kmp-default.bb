SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.4.2_1"

RPM_NAME = "vhba-kmp-default-20211218_k6.4.2_1-3.12.aarch64.rpm"
RPM_HASH = "2c79652e83a602deb5b71ce471adcd6c3c1f049d63690c64a0467df9b445842ab94c8086fd9008349c7093ebab5a7d3088ca1b1268e1d5ba5af6cada789c32d7"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-default \
vhba-kmp-default-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
