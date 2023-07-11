SUMMARY = "Development files for muparser"
DESCRIPTION = "muParser is an extensible math parser library written in C++. It \
works by transforming a mathematical expression into bytecode and \
precalculating constant parts of the expression."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "muparser-devel-2.3.4-1.4.aarch64.rpm"
RPM_HASH = "d31f3c3320b098b5c17cf5cfbc47e929be805a7054dbdf5d1277d40953c4581837c2603a66f47ef722b25eabdcf45982ff993b8bff5ffd51165454326adb7d9a"

RPROVIDES:${PN} += "cmake-muparser \
muparser-devel \
pkgconfig-muparser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmuparser2-3-4"

inherit rpm
