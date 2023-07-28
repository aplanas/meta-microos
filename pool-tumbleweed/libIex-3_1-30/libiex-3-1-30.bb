SUMMARY = "Exception handling library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIex"
LICENSE = "BSD-3-Clause"

PV = "3.1.9"

RPM_NAME = "libIex-3_1-30-3.1.9-2.1.aarch64.rpm"
RPM_HASH = "c1589eac319a1bb9bc6b93a29143425c2f2697b0c26f45459e3877af6077304aaad9f92df37597f6ebdb2129b89c26a4a08f02b97cec98a79b20420f12523c10"

RPROVIDES:${PN} += "libIex-3-1-30 \
libIex-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
