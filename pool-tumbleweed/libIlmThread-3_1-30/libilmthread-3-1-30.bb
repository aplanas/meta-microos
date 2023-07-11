SUMMARY = "Thread abstraction library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIlmThread"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libIlmThread-3_1-30-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "868e1a36f9163f2fff7448b9a877da150dac9cd12766558c8ce44dd419aeaaf2dadf152044a2bdd290da65bd5b1600f1a3544e63e7c080f3cc6ae2834e098990"

RPROVIDES:${PN} += "libIlmThread-3-1-30 \
libIlmThread-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
