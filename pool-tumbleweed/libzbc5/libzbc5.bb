SUMMARY = "Library for manipulating ZBC and ZAC disks"
DESCRIPTION = "libzbc is a simple library providing functions for manipulating Zoned \
Block Command (ZBC) and Zoned-device ATA command set (ZAC) disks. \
libzbc also has an mode for emulating the behavior of a zoned disk \
using a regular file or raw block device."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "libzbc5-5.13.0-1.3.aarch64.rpm"
RPM_HASH = "9df98a328ed461d22484135998fe320911d5e83a0a357a0c2ac81ca2ecd055863627fedcfd0a200e63202d7901435c8e792b4f313a23342c3e01393b7cffd4a7"

RPROVIDES:${PN} += "libzbc.so.5 \
libzbc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
