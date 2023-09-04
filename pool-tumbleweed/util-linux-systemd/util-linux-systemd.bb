SUMMARY = "A collection of basic system utilities (systemd dependent part)"
DESCRIPTION = "This package contains a large variety of low-level system utilities \
that are necessary for a Linux system to function. It contains the \
mount program, the fdisk configuration tool, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "util-linux-systemd-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "e539a2aeef636a1c1914365b4d4c99165ed505444502a89e33e0712023f325c650eef2a074102eec3cb9cfa58703fcfb948cd5d117291c42aacad6fd92a81fb8"

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
