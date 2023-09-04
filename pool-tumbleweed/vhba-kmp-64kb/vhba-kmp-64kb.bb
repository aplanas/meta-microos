SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.4.11_1"

RPM_NAME = "vhba-kmp-64kb-20211218_k6.4.11_1-3.18.aarch64.rpm"
RPM_HASH = "f084dfa6afb29957910a5f7a9179ba9e5ea07f46907cb4cbdeb0fe6c5baf07c5af9b406447b911c249ab9432daaa0c84d42eb14b13cf917350acf8f47297c3f6"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-64kb \
vhba-kmp-64kb-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
