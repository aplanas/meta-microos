SUMMARY = "Include Files and Libraries for developing with libbtrfsutil"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfsutil-devel-6.3-1.1.aarch64.rpm"
RPM_HASH = "2cc09c9b34088b3c8c744e09e06ecf4a25c46120e69d540a3febc8a56adac08e8bfa5006658ed9ecbbf2c69797e900fff0f33fdf8bec5f7535e8e2233eb3063e"

RPROVIDES:${PN} += "libbtrfsutil-devel \
pkgconfig-libbtrfsutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
btrfsprogs \
libbtrfsutil1"

inherit rpm
