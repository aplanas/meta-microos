SUMMARY = "A collection of basic system utilities (core part)"
DESCRIPTION = "This package contains a large variety of low-level system utilities \
that are necessary for a Linux system to function. It contains the \
mount program, the fdisk configuration tool, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "util-linux-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "29985d064be558c78735a93b83977053fa0d13b29aa939d46a15eaf2466e3b7ee27af60c121a848837faa4130949e105a9262a977079dc1c8331e7684266ee1a"

RPROVIDES:${PN} += "/bin/kill \
/bin/more \
/bin/mount \
/bin/su \
/bin/umount \
config(util-linux) \
eject \
fsck-with-dev-lock \
hardlink \
login \
rfkill \
util-linux \
util-linux(aarch-64) \
util-linux(fake+no-canonicalize)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libaudit.so.1()(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_2_31)(64bit) \
libblkid.so.1(BLKID_2_37)(64bit) \
libc.so.6()(64bit) \
libcap-ng.so.0()(64bit) \
libcrypt.so.1()(64bit) \
libeconf.so.0()(64bit) \
libfdisk.so.1()(64bit) \
libmagic.so.1()(64bit) \
libmount.so.1()(64bit) \
libmount.so.1(MOUNT_2_35)(64bit) \
libmount.so.1(MOUNT_2_37)(64bit) \
libmount.so.1(MOUNT_2_38)(64bit) \
libncursesw.so.6()(64bit) \
libpam.so.0()(64bit) \
libpam_misc.so.0()(64bit) \
libreadline.so.8()(64bit) \
libselinux.so.1()(64bit) \
libsmartcols.so.1()(64bit) \
libtinfo.so.6()(64bit) \
libutempter.so.0()(64bit) \
libuuid.so.1()(64bit) \
libz.so.1()(64bit) \
permissions"

inherit rpm
