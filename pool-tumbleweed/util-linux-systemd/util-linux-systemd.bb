SUMMARY = "A collection of basic system utilities (systemd dependent part)"
DESCRIPTION = "This package contains a large variety of low-level system utilities \
that are necessary for a Linux system to function. It contains the \
mount program, the fdisk configuration tool, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "util-linux-systemd-2.39-2.1.aarch64.rpm"
RPM_HASH = "f19498b78bdedbbcf4b0b37cc6cc3d1c7b008f895ce4172d390fe3f4f3a4fc8ead74ac7659de98d66de0679d4b6fca0305dfb85e17dc462e344305a08fce7ec1"

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
