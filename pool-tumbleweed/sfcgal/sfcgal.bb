SUMMARY = "C++ wrapper library around CGAL"
DESCRIPTION = "This package contains tools & sample data to test libSFCGAL1."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "sfcgal-1.4.1-4.4.aarch64.rpm"
RPM_HASH = "27e79580acd1f53401f116549cf3bd363e728e697f6fd837cbd076a4576459f8c1282d4fa4f83d378ee843201819b47256a3d630f0c0dc154c114ff56d731e9f"

RPROVIDES:${PN} += "sfcgal \
sfcgal(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSFCGAL.so.1()(64bit) \
libboost_chrono.so.1.82.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libboost_serialization.so.1.82.0()(64bit) \
libboost_unit_test_framework.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libm.so.6()(64bit) \
libmpfr.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
