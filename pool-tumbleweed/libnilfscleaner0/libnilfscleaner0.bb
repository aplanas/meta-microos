SUMMARY = "Cleaner library for interacting with nilfs"
DESCRIPTION = "This package contains shared cleaner library needed for some applications \
to interface with nilfs"
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "libnilfscleaner0-2.2.9-1.5.aarch64.rpm"
RPM_HASH = "cb86e6e57306589520e654fba0006097b58768d629defa6198d4c8d0e448f5cf0ff5f41deae0c7c37477b84038f438ea98f47ad728d5c112cb3afeaae7496728"

RPROVIDES:${PN} += "libnilfscleaner.so.0 \
libnilfscleaner0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
