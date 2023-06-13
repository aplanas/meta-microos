SUMMARY = "Development files for folly, a utility library"
DESCRIPTION = "Development files library for folly, a C++ utility library."
LICENSE = "MIT"

PV = "2023.05.01.00"

RPM_NAME = "folly-devel-2023.05.01.00-1.1.aarch64.rpm"
RPM_HASH = "cb7acf1d231c9bd26e5d648deaf819cfc79a2bdb94e5f9c7698fa750ea222e2db1c383c9385bd4e181def125129b7e48cedf9a78e7acb2cf8a8374e41a3f50d2"

RPROVIDES:${PN} += "cmake(folly) \
folly-devel \
folly-devel(aarch-64) \
pkgconfig(libfolly)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfolly-v2023_05_01_00"

inherit rpm
