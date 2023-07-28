SUMMARY = "Thread abstraction library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIlmThread"
LICENSE = "BSD-3-Clause"

PV = "3.1.9"

RPM_NAME = "libIlmThread-3_1-30-3.1.9-2.1.aarch64.rpm"
RPM_HASH = "865988c8e1149e1a24911a6970bbae782b32c9bf201b4f8d917fa2c5fbeab14c4061cc6a8c5acd46aa8685ee7082c6770493cd61513b89f65d12946bfe382757"

RPROVIDES:${PN} += "libIlmThread-3-1-30 \
libIlmThread-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
