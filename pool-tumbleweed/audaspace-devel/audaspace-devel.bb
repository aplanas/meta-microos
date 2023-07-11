SUMMARY = "Development files for audaspace"
DESCRIPTION = "The audaspace-devel package contains libraries and header files for \
developing applications that use audaspace."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-devel-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "83b7ee9d0d6a5a638f847db695b0ce8bf3af200c42884ae9919bab5e83bc279b58bcd21d5932e5d3e994244b1d8fdcd6b4f7b3718c43ab7782b7781494a75be5"

RPROVIDES:${PN} += "audaspace-devel \
pkgconfig-audaspace"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudaspace-c1-4 \
libaudaspace-py1-4 \
libaudaspace1-4"

inherit rpm
