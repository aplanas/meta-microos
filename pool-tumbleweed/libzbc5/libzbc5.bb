SUMMARY = "Library for manipulating ZBC and ZAC disks"
DESCRIPTION = "libzbc is a simple library providing functions for manipulating Zoned \
Block Command (ZBC) and Zoned-device ATA command set (ZAC) disks. \
libzbc also has an mode for emulating the behavior of a zoned disk \
using a regular file or raw block device."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "libzbc5-5.13.0-1.4.aarch64.rpm"
RPM_HASH = "23735cc998422f320e0bb94b79b5b4241f362d9fc168d7c3c31f60e235e09712fb073db843ecd7d16b4bb12eb56a25b33d0d129a1a61d012fed00aa0e0ff163a"

RPROVIDES:${PN} += "libzbc.so.5 \
libzbc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
