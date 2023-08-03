SUMMARY = "Simple SVG parse"
DESCRIPTION = "Shared library built from the code in the nanosvgrast. header file \
 \
Provides functions to rasterize SVG image, \
returns RGBA image (non-premultiplied alpha)"
LICENSE = "Zlib"

PV = "2022.12.22"

RPM_NAME = "libnanosvgrast0-2022.12.22-1.1.aarch64.rpm"
RPM_HASH = "c4ce36bfc61d0f7ac1b557811253802965db894ae91674650e47e9f2cb2293e86036f255db8bf4664f9cd735f14ffcf51dd8d1b1fb66eedfffdfd87132d8550f"

RPROVIDES:${PN} += "libnanosvgrast.so.0 \
libnanosvgrast0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
