SUMMARY = "Development files for access to MTP Player library"
DESCRIPTION = "This package contains the development headers for the libmtp library \
that allows access to USB based media players based on the MTP (Media \
Transfer Protocol) authored by Microsoft."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.21"

RPM_NAME = "libmtp-devel-1.1.21-1.1.aarch64.rpm"
RPM_HASH = "1733a396a79499d1fbb2b5325f98965381b0299b357a257eaa36594d04788554ec9deda7d60e3404cff2e43f21c6911983aceea6df0966c35bfbc07ffccf31d8"

RPROVIDES:${PN} += "libmtp-devel \
pkgconfig-libmtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmtp9 \
pkgconfig-libusb-1.0"

inherit rpm
