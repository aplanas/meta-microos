SUMMARY = "A collection of basic system utilities (systemd dependent part)"
DESCRIPTION = "This package contains a large variety of low-level system utilities \
that are necessary for a Linux system to function. It contains the \
mount program, the fdisk configuration tool, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "util-linux-systemd-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "b02746060c6becbaed77d40edf785013055e8d01e0ea7817f4d7509c1cfdad968eb9e7a5158b36e515f14e4f8cf4fcf654269978b4618b3aee6490bcbcda8e2e"

RPROVIDES:${PN} += "/usr/bin/logger \
util-linux-systemd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libeconf.so.0 \
libmount.so.1 \
libselinux.so.1 \
libsmartcols.so.1 \
libsystemd.so.0 \
libudev.so.1 \
permissions \
systemd"

inherit rpm
