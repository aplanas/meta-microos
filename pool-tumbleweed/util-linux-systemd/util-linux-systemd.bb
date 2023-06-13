SUMMARY = "A collection of basic system utilities (systemd dependent part)"
DESCRIPTION = "This package contains a large variety of low-level system utilities \
that are necessary for a Linux system to function. It contains the \
mount program, the fdisk configuration tool, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "util-linux-systemd-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "7eb1d5fa8e46c87756821ea629c3f3b5f11bdab4a13ff49983f3ef78151465534719cedb45fce9fdaf25fc71b278b5204be755eeb531d660237f7f1a84d06638"

RPROVIDES:${PN} += "/bin/logger \
util-linux-systemd \
util-linux-systemd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libeconf.so.0()(64bit) \
libmount.so.1()(64bit) \
libmount.so.1(MOUNT_2_37)(64bit) \
libselinux.so.1()(64bit) \
libsmartcols.so.1()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
permissions \
systemd"

inherit rpm
