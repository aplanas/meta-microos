SUMMARY = "Development files for the primecount library"
DESCRIPTION = "This package contains the C/C++ header files and the configuration \
files for developing applications that use the primecount library."
LICENSE = "BSD-2-Clause"

PV = "7.9"

RPM_NAME = "libprimecount-devel-7.9-1.1.aarch64.rpm"
RPM_HASH = "3f80f87d1d5f5bbfb1ad031c1646ad6d8909ce49759b27513e8421a1c4871b01b4d2142710a6abfe00545f7198a461f040f4116ac34b5ac35f4c2b5fa80fc89f"

RPROVIDES:${PN} += "libprimecount-devel \
pkgconfig-primecount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprimecount7 \
pkgconfig-primesieve"

inherit rpm
