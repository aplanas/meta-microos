SUMMARY = "Parser library for the Drawing Exchange Format (DXF)"
DESCRIPTION = "dxflib is a C++ library mainly for parsing and writing DXF files. \
QCAD/LibreCAD uses dxflib to import DXF files."
LICENSE = "GPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "libdxflib-3_26_4-1-3.26.4-2.8.aarch64.rpm"
RPM_HASH = "79c6811f08b72acc59e99d74f95bb8dd432f32fcd63f574512d16525c38e5bea2501c7772c4a8063ba0a8e80230eadc789275998aaca74eca8aebf732fce1e51"

RPROVIDES:${PN} += "libdxflib-3.26.4.so.1()(64bit) \
libdxflib-3_26_4-1 \
libdxflib-3_26_4-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
