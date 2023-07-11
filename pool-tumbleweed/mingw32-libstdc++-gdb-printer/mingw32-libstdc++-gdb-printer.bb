SUMMARY = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
DESCRIPTION = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libstdc++-gdb-printer-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "939e9b515eba26698a805a70a6fbb555d867a5aa93bc150396edda690c48c9ef141b98fbd07b647e8435239b650d641ee05a71bba0471941d99ef6b15c2bfe49"

RPROVIDES:${PN} += "mingw32-libstdc++-gdb-printer"

RDEPENDS:${PN} += ""

inherit rpm
