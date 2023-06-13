SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libfdisk-devel-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "d0b256e88d2e9a2527c9edd7090ba4c8b0ee894d9f16c0afa14c802f7c8fde09d52b2a8518ac4a5bbf49f0a41caa12c880f6ccef9c6990aee0365c4304e0b435"

RPROVIDES:${PN} += "libfdisk-devel \
libfdisk-devel(aarch-64) \
pkgconfig(fdisk)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdisk1 \
pkgconfig(blkid) \
pkgconfig(uuid)"

inherit rpm
