SUMMARY = "Event driven initramfs infrastructure"
DESCRIPTION = "Dracut contains tools to create a bootable initramfs for Linux kernels >= 2.6. \
Dracut contains various modules which are driven by the event-based udev \
and systemd. Having root on MD, DM, LVM2, LUKS is supported as well as \
NFS, iSCSI, NBD, FCoE."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.476.g5e324584"

RPM_NAME = "dracut-059+suse.476.g5e324584-1.1.aarch64.rpm"
RPM_HASH = "db61be49839263c63088461c474c80a3463d670eaf1f89ef3654e2575ccfebe322b4cbe0791e86dd1f1f2b58429f1d1c9875328b5467173eee251e53fe0a41d8"

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
