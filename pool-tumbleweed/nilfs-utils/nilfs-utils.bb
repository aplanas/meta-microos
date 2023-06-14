SUMMARY = "Utilities for NILFS"
DESCRIPTION = "This package contains utility programs for NILFS v2."
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "nilfs-utils-2.2.9-1.4.aarch64.rpm"
RPM_HASH = "e2a90f126c520aa4cfecd3ac9169c0272e0642addb12e00660a623c2097d45b2215a10209c8f5a8c3a7342bdb87ca2bf6832b1bb9c818c207b3fca264d30237e"

RPROVIDES:${PN} += "config-nilfs-utils \
nilfs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libmount.so.1 \
libnilfs.so.0 \
libnilfscleaner.so.0 \
libnilfsgc.so.0 \
libuuid.so.1"

inherit rpm
