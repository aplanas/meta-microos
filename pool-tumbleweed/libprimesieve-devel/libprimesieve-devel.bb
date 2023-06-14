SUMMARY = "Development files for the primesieve library"
DESCRIPTION = "This package contains the C/C++ header files and the configuration \
files for developing applications that use the primesieve library. \
It also contains the API documentation of the library."
LICENSE = "BSD-2-Clause"

PV = "11.1"

RPM_NAME = "libprimesieve-devel-11.1-1.1.aarch64.rpm"
RPM_HASH = "4a4ad8536d534a28470b440377b0a848024237f4fc1ba8ee17a5e5adee162fd6ccca9f24f5b087fa8f27efda46b3717f7d4cae28b8305e3c39712f19604abfb8"

RPROVIDES:${PN} += "cmake-primesieve \
libprimesieve-devel \
pkgconfig-primesieve"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprimesieve11"

inherit rpm
