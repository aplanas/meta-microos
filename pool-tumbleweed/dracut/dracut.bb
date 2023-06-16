SUMMARY = "Event driven initramfs infrastructure"
DESCRIPTION = "Dracut contains tools to create a bootable initramfs for Linux kernels >= 2.6. \
Dracut contains various modules which are driven by the event-based udev \
and systemd. Having root on MD, DM, LVM2, LUKS is supported as well as \
NFS, iSCSI, NBD, FCoE."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.375.gafb362e4"

RPM_NAME = "dracut-059+suse.375.gafb362e4-1.1.aarch64.rpm"
RPM_HASH = "50d30e3f44efaa006b38a6c20faa3bc7fa0cd0b49c0e2de3752bab8c8f731b48d66409a2f73edc89de38a22510302df4b4f176dc1bb7113cf7a5b0ea9f7a9e09"

RPROVIDES:${PN} += "config-dracut \
dracut \
pkgconfig-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/get-kernel-version \
/usr/bin/pkg-config \
/usr/bin/sh \
awk \
bash \
coreutils \
cpio \
elfutils \
file \
filesystem \
findutils \
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
