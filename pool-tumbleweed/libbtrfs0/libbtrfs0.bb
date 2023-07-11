SUMMARY = "Library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfs.so shared library needed for some \
applications to interface with btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfs0-6.3-2.2.aarch64.rpm"
RPM_HASH = "04920e2a7e30b58567399c1501747361aefca288970994b2291330a83e3f200b74f06068268596165641eb9cc579967b431de11561b0971010b3c208f64e80a5"

RPROVIDES:${PN} += "libbtrfs.so.0 \
libbtrfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
