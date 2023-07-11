SUMMARY = "Event driven initramfs infrastructure"
DESCRIPTION = "Dracut contains tools to create a bootable initramfs for Linux kernels >= 2.6. \
Dracut contains various modules which are driven by the event-based udev \
and systemd. Having root on MD, DM, LVM2, LUKS is supported as well as \
NFS, iSCSI, NBD, FCoE."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.447.g9d1fc722"

RPM_NAME = "dracut-059+suse.447.g9d1fc722-1.1.aarch64.rpm"
RPM_HASH = "c78eed0b98acec2fdff6472f7a56c28b8ce0f4fe0f6649b9fb27b9ce9528b9f190f289ac5084b974b33f1fed00b63ec9d113ffbd87a0f054368f70f80895d176"

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
