SUMMARY = "Library for computation of Gröbner bases with 4ti2"
DESCRIPTION = "This package contains the 4ti2 program library, which comes in three \
flavors: \
- 32-bit precision integers \
- 64-bit precision integers \
- arbitrary precision integer support through use of GNU MP"
LICENSE = "GPL-2.0-or-later"

PV = "1.6.10"

RPM_NAME = "lib4ti2-0-1.6.10-1.2.aarch64.rpm"
RPM_HASH = "ae043abf9099ccabf6b59c23d2fd1f382324d3ed09275b0ee3d2a568e5f71a10217c3c9c78c5eff6c1be3bfafbec8d074ee325a15be4470e98cfa3ee93c8dbca"

RPROVIDES:${PN} += "lib4ti2-0 \
lib4ti2common.so.0 \
lib4ti2gmp.so.0 \
lib4ti2int32.so.0 \
lib4ti2int64.so.0 \
lib4ti2util.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libglpk.so.40 \
libgmp.so.10 \
libgmpxx.so.4 \
libstdc++.so.6"

inherit rpm
