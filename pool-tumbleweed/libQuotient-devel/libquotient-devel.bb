SUMMARY = "Development files for libQuotient"
DESCRIPTION = "The libQuotient-devel package contains libraries and header files for \
developing applications that use libQuotient."
LICENSE = "LGPL-2.1-only"

PV = "0.6.11"

RPM_NAME = "libQuotient-devel-0.6.11-2.3.aarch64.rpm"
RPM_HASH = "cccf5512d2192e49f3d992f8096f2929375ace7a58f30dbfbaaa49959b31214ac771c8fcf27bb798430ae9fd690463c9c41811e6856b639063868773fae34e2a"

RPROVIDES:${PN} += "cmake-Quotient \
libQuotient-devel \
pkgconfig-Quotient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQuotient0-6"

inherit rpm
