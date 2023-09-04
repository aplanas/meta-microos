SUMMARY = "Event driven initramfs infrastructure"
DESCRIPTION = "Dracut contains tools to create a bootable initramfs for Linux kernels >= 2.6. \
Dracut contains various modules which are driven by the event-based udev \
and systemd. Having root on MD, DM, LVM2, LUKS is supported as well as \
NFS, iSCSI, NBD, FCoE."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.491.g87f19c22"

RPM_NAME = "dracut-059+suse.491.g87f19c22-1.1.aarch64.rpm"
RPM_HASH = "03a0f946dbe9b202202834c52a39fdd0ad95cabfbf7d94a97dd5d390150a11fdb4aedf69601d4af7cfd95fd15807898866b346e2353c1774ed79110c0354037f"

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
