SUMMARY = "A collection of basic system utilities (systemd dependent part)"
DESCRIPTION = "This package contains a large variety of low-level system utilities \
that are necessary for a Linux system to function. It contains the \
mount program, the fdisk configuration tool, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "util-linux-systemd-2.39-3.1.aarch64.rpm"
RPM_HASH = "97257241128d48e91184eef8f7de03dc6acf91a202f6809a74f234e59baceca67370b8eb5a7e90cf2f61294c85aa6531b06b8e384f9f6fc64e2eae3675b4b484"

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
