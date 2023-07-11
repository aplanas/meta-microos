SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.3.9_1"

RPM_NAME = "vhba-kmp-64kb-20211218_k6.3.9_1-3.11.aarch64.rpm"
RPM_HASH = "8b4a3d0cf4b67adba527d5d2bc97526e4dade395b98257a30b47ed261beab5cd37596b0c55a561b6ecd006ff88ce496e7c84e999151a8121186c8f57d4f7e3c1"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-64kb \
vhba-kmp-64kb-k6.3.9-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
