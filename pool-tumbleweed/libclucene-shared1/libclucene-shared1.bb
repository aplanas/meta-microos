SUMMARY = "CLucene cross-platform layer"
DESCRIPTION = "This package creates a library that is used in all the CLucene \
projects. It provides cross-platform macros and functions, as well as \
things like cl_* string macros, file handling functions, replacement \
functions, etc."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-shared1-2.3.3.4-18.5.aarch64.rpm"
RPM_HASH = "bb6d9565d961292ba1a43127cb754ee65fd7fdf3fe0ff685e671a54646fc86fc62de3affbae3a9999554a52496f98d4b01c71df666a1cfe8bc786cad07bab973"

RPROVIDES:${PN} += "libclucene-shared.so.1()(64bit) \
libclucene-shared1 \
libclucene-shared1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
