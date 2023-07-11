SUMMARY = "Examples for the oneAPI Video Processing Library (oneVPL) dispatcher"
DESCRIPTION = "This package contains example applications for the oneAPI Video Processing Library (oneVPL) dispatcher."
LICENSE = "MIT"

PV = "2023.2.0"

RPM_NAME = "libvpl-samples-2023.2.0-1.2.aarch64.rpm"
RPM_HASH = "586a87b7f406abb2f387c4231fdddd4e1884a5a1381c0db029500ec703068abd9b0d272d834317f71523cb413a7fb3b0b50467d04084faa493bb7e93653b27e9"

RPROVIDES:${PN} += "libvpl-samples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvpl.so.2"

inherit rpm
