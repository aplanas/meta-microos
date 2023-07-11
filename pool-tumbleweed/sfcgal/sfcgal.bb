SUMMARY = "C++ wrapper library around CGAL"
DESCRIPTION = "This package contains tools & sample data to test libSFCGAL1."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "sfcgal-1.4.1-4.5.aarch64.rpm"
RPM_HASH = "f40a277da405b77367422466cb1d0ee0f7c0bfcaccff6e6c9ef93cdb3eb43b97b46fc0da5853a49d4c7d66acc1c0d712b449d219f7346a209a4080d7c002f6d7"

RPROVIDES:${PN} += "sfcgal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSFCGAL.so.1 \
libboost-chrono.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libboost-unit-test-framework.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
