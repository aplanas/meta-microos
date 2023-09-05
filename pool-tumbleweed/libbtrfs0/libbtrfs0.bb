SUMMARY = "Library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfs.so shared library needed for some \
applications to interface with btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfs0-6.3-3.1.aarch64.rpm"
RPM_HASH = "29826cbde0e0f2990d06a3d5d2bd421280a5ebe192632f2f7c12514f0359724d095d150bc6a7e8555ea10d16a951b90f476d43e4a0fabf94e50c5840dc733adf"

RPROVIDES:${PN} += "libbtrfs.so.0 \
libbtrfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
