SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.4.3_1"

RPM_NAME = "vhba-kmp-64kb-20211218_k6.4.3_1-3.13.aarch64.rpm"
RPM_HASH = "d29de45052e7a7b93e51db35eb921f57f992cd733a0dcdb19fac92bafd495e1239339250b03b5b966a6d9528e1562ad67f8a99592d2ef5db4beb182b6a035da5"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-64kb \
vhba-kmp-64kb-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
