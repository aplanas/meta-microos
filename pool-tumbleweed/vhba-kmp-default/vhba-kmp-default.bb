SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.4.6_1"

RPM_NAME = "vhba-kmp-default-20211218_k6.4.6_1-3.15.aarch64.rpm"
RPM_HASH = "8c26444efdea323826dfb5beda6a9cc14102657b157cf9816d6bb6fa1e22617e7daf33178a115cc1594a5b162b15ec73f1814a6d63215aacedc004c57fb68071"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-default \
vhba-kmp-default-k6.4.6-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
