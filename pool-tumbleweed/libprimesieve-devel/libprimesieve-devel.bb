SUMMARY = "Development files for the primesieve library"
DESCRIPTION = "This package contains the C/C++ header files and the configuration \
files for developing applications that use the primesieve library. \
It also contains the API documentation of the library."
LICENSE = "BSD-2-Clause"

PV = "11.1"

RPM_NAME = "libprimesieve-devel-11.1-1.2.aarch64.rpm"
RPM_HASH = "4955a546de4273a9db0d375049b59260b7add8e1393ce2c5ae9a08f8cfa1529d242f0bdcb25ff1f24ecf048547534d759ae6117847fd65e22876e532ac549dfe"

RPROVIDES:${PN} += "cmake-primesieve \
libprimesieve-devel \
pkgconfig-primesieve"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprimesieve11"

inherit rpm
