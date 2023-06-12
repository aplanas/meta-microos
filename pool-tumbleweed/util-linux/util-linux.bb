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
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudit.so.1()(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libblkid.so.1(BLKID_2.17)(64bit) \
libblkid.so.1(BLKID_2.18)(64bit) \
libblkid.so.1(BLKID_2.20)(64bit) \
libblkid.so.1(BLKID_2.21)(64bit) \
libblkid.so.1(BLKID_2.23)(64bit) \
libblkid.so.1(BLKID_2.25)(64bit) \
libblkid.so.1(BLKID_2.30)(64bit) \
libblkid.so.1(BLKID_2_31)(64bit) \
libblkid.so.1(BLKID_2_37)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcap-ng.so.0()(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libeconf.so.0()(64bit) \
libeconf.so.0(LIBECONF_0.2)(64bit) \
libfdisk.so.1()(64bit) \
libfdisk.so.1(FDISK_2.26)(64bit) \
libfdisk.so.1(FDISK_2.27)(64bit) \
libfdisk.so.1(FDISK_2.28)(64bit) \
libfdisk.so.1(FDISK_2.29)(64bit) \
libfdisk.so.1(FDISK_2.30)(64bit) \
libfdisk.so.1(FDISK_2.31)(64bit) \
libfdisk.so.1(FDISK_2.32)(64bit) \
libfdisk.so.1(FDISK_2.33)(64bit) \
libfdisk.so.1(FDISK_2.36)(64bit) \
libfdisk.so.1(FDISK_2.38)(64bit) \
libmagic.so.1()(64bit) \
libmount.so.1()(64bit) \
libmount.so.1(MOUNT_2.19)(64bit) \
libmount.so.1(MOUNT_2.20)(64bit) \
libmount.so.1(MOUNT_2.21)(64bit) \
libmount.so.1(MOUNT_2.22)(64bit) \
libmount.so.1(MOUNT_2.23)(64bit) \
libmount.so.1(MOUNT_2.24)(64bit) \
libmount.so.1(MOUNT_2.25)(64bit) \
libmount.so.1(MOUNT_2.30)(64bit) \
libmount.so.1(MOUNT_2.33)(64bit) \
libmount.so.1(MOUNT_2.34)(64bit) \
libmount.so.1(MOUNT_2_35)(64bit) \
libmount.so.1(MOUNT_2_37)(64bit) \
libmount.so.1(MOUNT_2_38)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam_misc.so.0()(64bit) \
libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) \
libreadline.so.8()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsmartcols.so.1()(64bit) \
libsmartcols.so.1(SMARTCOLS_2.25)(64bit) \
libsmartcols.so.1(SMARTCOLS_2.27)(64bit) \
libsmartcols.so.1(SMARTCOLS_2.28)(64bit) \
libsmartcols.so.1(SMARTCOLS_2.29)(64bit) \
libsmartcols.so.1(SMARTCOLS_2.30)(64bit) \
libsmartcols.so.1(SMARTCOLS_2.31)(64bit) \
libsmartcols.so.1(SMARTCOLS_2.33)(64bit) \
libsmartcols.so.1(SMARTCOLS_2.38)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libutempter.so.0()(64bit) \
libutempter.so.0(UTEMPTER_1.1)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libuuid.so.1(UUID_2.31)(64bit) \
libz.so.1()(64bit) \
permissions"

inherit rpm