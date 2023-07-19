SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.4.3_1"

RPM_NAME = "vhba-kmp-default-20211218_k6.4.3_1-3.13.aarch64.rpm"
RPM_HASH = "3e24ae540737cbdda019e2bc4e7a1d033a72763ef6a86f2eac68e0270e5e7f03a0da59e9a4d240934c8542386be3092ea292cb44a46556f708f3c9f3ff85f9a0"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-default \
vhba-kmp-default-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
