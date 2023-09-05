SUMMARY = "C library for reading, creating, and modifying zip archives"
DESCRIPTION = "libzip is a C library for reading, creating, and modifying zip \
archives. This package contains devel files."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "libzip-devel-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "5cddc282a1639f15f4875e5d73769f7089b2bd1c8f341c675d3f51f45c4769d3c93521c44380d28f5ea5aa2657eabed85f3e74d244093fa13437b202e6d1d2bd"

RPROVIDES:${PN} += "cmake-libzip \
libzip-devel \
pkgconfig-libzip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libzip5"

inherit rpm
