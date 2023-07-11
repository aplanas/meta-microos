SUMMARY = "Development files for libcaes, a AES encryption library"
DESCRIPTION = "libcaes is a library for AES encryption. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcaes."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "libcaes-devel-20230406-1.4.aarch64.rpm"
RPM_HASH = "6cfdd8c5f9f0b9003138c7edf938cb3bfad01f0a9e7755fec1e0d56de0a4044972ee12d948334f0a552cb1e1ca8a82e6c6979803bdf7fd927b0a074712052096"

RPROVIDES:${PN} += "libcaes-devel \
pkgconfig-libcaes"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcaes1"

inherit rpm
