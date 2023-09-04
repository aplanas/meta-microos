SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.4.11_1"

RPM_NAME = "vhba-kmp-default-20211218_k6.4.11_1-3.18.aarch64.rpm"
RPM_HASH = "3e5269aa66b0af9a89c7aed3ba8a542496cbe37744b14b9d497d81049e9d78b6b63da7516efa848ade9224cbf5cfae45f8f7c332da8829ae622271bfbcf30582"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-default \
vhba-kmp-default-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
