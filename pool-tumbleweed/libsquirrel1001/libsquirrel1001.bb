SUMMARY = "Development files for squirrel"
DESCRIPTION = "This package contains runtime library for Squirrel"
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "libsquirrel1001-3.2-2.3.aarch64.rpm"
RPM_HASH = "1155f6a6056fba1aa155ca98dd9f17f905fe01efb094ffe661a60f3b117a38a9ed2b2abc9e138b8c3de9dac0d32142f2640cb2c6932f8b3ba46d40c038f223b3"

RPROVIDES:${PN} += "libsqstdlib3.so.1001 \
libsquirrel1001 \
libsquirrel3.so.1001"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
