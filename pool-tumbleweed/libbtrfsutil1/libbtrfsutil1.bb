SUMMARY = "Utility library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfsutil.so shared library. This library is \
LGPL unlike libbtrfs.so and can be used by applications to interact with Btrfs \
filesystems."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfsutil1-6.3-3.1.aarch64.rpm"
RPM_HASH = "3143d9424a7c9efd3e21ddbf4aa88f5944350cdbf097eaad54c86431871c9d56076d1152b59b17a1b84af4506aeaae4aecc737b0f80e49122877e3146561717c"

RPROVIDES:${PN} += "libbtrfsutil.so.1 \
libbtrfsutil1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
