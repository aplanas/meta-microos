SUMMARY = "Exception handling library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIex"
LICENSE = "BSD-3-Clause"

PV = "3.1.11"

RPM_NAME = "libIex-3_1-30-3.1.11-1.1.aarch64.rpm"
RPM_HASH = "c07bf0ff0490c07085ca3ee7515547be9f6cddca74c336ea971d7c5e890c9126dba620e8233874fccba3402bae7b175a0db10e37a7ecf84ca474024cdb47d304"

RPROVIDES:${PN} += "libIex-3-1-30 \
libIex-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
