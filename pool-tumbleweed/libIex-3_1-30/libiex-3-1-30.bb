SUMMARY = "Exception handling library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIex"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libIex-3_1-30-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "48201ccea8a1c55e74273dab21e845ac37c3bff676db4f023ccecf08d17a79acb3f2e247eec9e205407168f9830421cf937f5a64d4558727d4242044a0e4e088"

RPROVIDES:${PN} += "libIex-3-1-30 \
libIex-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
