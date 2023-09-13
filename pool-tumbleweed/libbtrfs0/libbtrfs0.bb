SUMMARY = "Library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfs.so shared library needed for some \
applications to interface with btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.5"

RPM_NAME = "libbtrfs0-6.5-1.1.aarch64.rpm"
RPM_HASH = "ab488fb78174d5f65a6363d9ce1ba743f6e13339d3ccbc50427269c1abb95ef15500b46fe7592bb8dade6ee9d948c0a02ed174e02e225dc8ab4b4942dc1cf783"

RPROVIDES:${PN} += "libbtrfs.so.0 \
libbtrfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
