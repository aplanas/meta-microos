SUMMARY = "C++ wrapper library around CGAL"
DESCRIPTION = "This package contains tools & sample data to test libSFCGAL1."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "sfcgal-1.4.1-4.4.aarch64.rpm"
RPM_HASH = "27e79580acd1f53401f116549cf3bd363e728e697f6fd837cbd076a4576459f8c1282d4fa4f83d378ee843201819b47256a3d630f0c0dc154c114ff56d731e9f"

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
