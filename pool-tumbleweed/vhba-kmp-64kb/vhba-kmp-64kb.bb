SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.4.6_1"

RPM_NAME = "vhba-kmp-64kb-20211218_k6.4.6_1-3.15.aarch64.rpm"
RPM_HASH = "f9fccf03f3c2577008c1b9e2bbbd18c18619ddcada73a963312a2fac39bb800fac566bea1e44578f459adc911f4efa058b41195d2c4112776b36850bf4337069"

RPROVIDES:${PN} += "kmod-vhba.ko \
multiversion-kernel \
vhba-kmp \
vhba-kmp-64kb \
vhba-kmp-64kb-k6.4.6-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
