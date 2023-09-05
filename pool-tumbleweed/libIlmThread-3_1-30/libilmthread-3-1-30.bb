SUMMARY = "Thread abstraction library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIlmThread"
LICENSE = "BSD-3-Clause"

PV = "3.1.11"

RPM_NAME = "libIlmThread-3_1-30-3.1.11-1.1.aarch64.rpm"
RPM_HASH = "8fda9e4ac3192463383ea8cc5ac7e9562f4cf3d59bf7a9c474c869a46d5328609fab37f4696b238ab9a345057f64dd965df7a4645f4cbb5727c67743570fd7d2"

RPROVIDES:${PN} += "libIlmThread-3-1-30 \
libIlmThread-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
