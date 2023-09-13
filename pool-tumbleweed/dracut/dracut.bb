SUMMARY = "Event driven initramfs infrastructure"
DESCRIPTION = "Dracut contains tools to create a bootable initramfs for Linux kernels >= 2.6. \
Dracut contains various modules which are driven by the event-based udev \
and systemd. Having root on MD, DM, LVM2, LUKS is supported as well as \
NFS, iSCSI, NBD, FCoE."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.497.ga7feaf12"

RPM_NAME = "dracut-059+suse.497.ga7feaf12-1.1.aarch64.rpm"
RPM_HASH = "c59a894a7d9ed953264e91650502ef6ecddc19f3543435041ce380f7e3ce9fd65c8f5d819eda223f618ed7c112066e15b94504045994dd4697515472e91a22d4"

RPROVIDES:${PN} += "config-dracut \
dracut \
pkgconfig-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/get-kernel-version \
/usr/bin/pkg-config \
/usr/bin/sh \
bash \
coreutils \
cpio \
elfutils \
file \
filesystem \
findutils \
gawk \
grep \
hardlink \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkmod.so.2 \
modutils \
pigz \
sed \
systemd \
udev \
util-linux \
util-linux-systemd \
zstd"

inherit rpm
