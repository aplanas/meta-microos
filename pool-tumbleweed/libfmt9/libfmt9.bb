SUMMARY = "A formatting library for C++"
DESCRIPTION = "Shared library for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "libfmt9-9.1.0-2.3.aarch64.rpm"
RPM_HASH = "b6ba4ecabb42cffc4dff68395a7237efd338b48c26362b273e9e1102343c2c81d7f168a5b4352ba1626740fc7e5f64a74b40891ef4752d4991e91ce3cc144e8b"

RPROVIDES:${PN} += "libfmt.so.9 \
libfmt9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
