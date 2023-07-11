SUMMARY = "Library to simplify development of OpenEXR utilities"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRUtil"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libOpenEXRUtil-3_1-30-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "13c8a195453f4ededf726a6c4d67d7c6e7c75021bca98b0e35f489c4940069074a7c0b09f931dd06ebde9a34908230d568d344b6c4d4ccbef42a5f8b6ec8825d"

RPROVIDES:${PN} += "libOpenEXRUtil-3-1-30 \
libOpenEXRUtil-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libOpenEXR-3-1.so.30 \
libOpenEXRCore-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
