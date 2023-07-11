SUMMARY = "Parser library for the Drawing Exchange Format (DXF)"
DESCRIPTION = "dxflib is a C++ library mainly for parsing and writing DXF files. \
QCAD/LibreCAD uses dxflib to import DXF files."
LICENSE = "GPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "libdxflib-3_26_4-1-3.26.4-2.9.aarch64.rpm"
RPM_HASH = "14279557f11535363a5fedabb4d4ef01c7e8569f7ac8334947a88432b510de5d56cfd4908009caa672b528ce52301e102232dee2043e779cf7545c26e64421df"

RPROVIDES:${PN} += "libdxflib-3-26-4-1 \
libdxflib-3.26.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
