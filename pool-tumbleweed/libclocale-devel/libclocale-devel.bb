SUMMARY = "Development files for libclocale, a C locale library"
DESCRIPTION = "A library for C locale functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libclocale."
LICENSE = "LGPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "libclocale-devel-20221218-1.3.aarch64.rpm"
RPM_HASH = "b13937df71ad343fea831a74ae8421bbef57ad8973a724dd1979ae3a6db0cbb0fe727ef62a9a1624bb4f5ef4d9e5e9b4bb81d44070c7d4b6d2fb6e78377670ed"

RPROVIDES:${PN} += "libclocale-devel \
pkgconfig-libclocale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclocale1"

inherit rpm
