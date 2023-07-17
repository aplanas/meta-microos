SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.4.2_1"

RPM_NAME = "vhba-kmp-64kb-20211218_k6.4.2_1-3.12.aarch64.rpm"
RPM_HASH = "23a36b50cb1dcb981c69e17ddb6567801284c880a5448bbc284120d4b23c127dc1cb3c7b85bef2f44021f8fe6ab3485bb399e754772a9d842d70357a5eb73664"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-64kb \
vhba-kmp-64kb-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
