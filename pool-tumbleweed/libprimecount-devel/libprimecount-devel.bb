SUMMARY = "Development files for the primecount library"
DESCRIPTION = "This package contains the C/C++ header files and the configuration \
files for developing applications that use the primecount library."
LICENSE = "BSD-2-Clause"

PV = "7.8"

RPM_NAME = "libprimecount-devel-7.8-1.1.aarch64.rpm"
RPM_HASH = "381982caec5799d4b112e2c28b1c42598163b4e83531cc12c4e88b28ddb5a8dcb3b4db2ac6ca4161b68e90cd40ec20c33d8b8ec9eaf4484be7fbf9d015c2a556"

RPROVIDES:${PN} += "libprimecount-devel \
pkgconfig-primecount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprimecount7 \
pkgconfig-primesieve"

inherit rpm
