SUMMARY = "A collection of basic system utilities (core part)"
DESCRIPTION = "This package contains a large variety of low-level system utilities \
that are necessary for a Linux system to function. It contains the \
mount program, the fdisk configuration tool, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "util-linux-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "e84aa704e090fef8e3b260df4edb85c7ec7214cc01d93ec521aaddcd28323aa4391e962b68cc0ba487a22091b66d1d0d13353158f78f4af4393ef22f03da45eb"

RPROVIDES:${PN} += "/usr/bin/kill \
/usr/bin/more \
/usr/bin/mount \
/usr/bin/su \
/usr/bin/umount \
config-util-linux \
eject \
fsck-with-dev-lock \
hardlink \
login \
rfkill \
util-linux \
util-linux-fake+no-canonicalize"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libcrypt.so.1 \
libeconf.so.0 \
libfdisk.so.1 \
libmagic.so.1 \
libmount.so.1 \
libncursesw.so.6 \
libpam-misc.so.0 \
libpam.so.0 \
libreadline.so.8 \
libselinux.so.1 \
libsmartcols.so.1 \
libtinfo.so.6 \
libutempter.so.0 \
libuuid.so.1 \
libz.so.1 \
permissions"

inherit rpm
