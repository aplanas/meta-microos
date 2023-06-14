SUMMARY = "Development files for libcbor"
DESCRIPTION = "libcbor is a C library for parsing and generating CBOR. \
The libcbor-devel contains libraries and header files for libcbor."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "libcbor-devel-0.10.2-1.2.aarch64.rpm"
RPM_HASH = "f8e1f1a61e2895047006b1d98b5910a7497ff52c0305b9c802dca372d1e828a4c3e2d9c186ab20ed411f482e5e00daec81ae088a553c9cd4ce846b3a95c56e53"

RPROVIDES:${PN} += "libcbor-devel \
pkgconfig-libcbor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcbor0-10"

inherit rpm
