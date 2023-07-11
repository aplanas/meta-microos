SUMMARY = "Development Files for pugixml"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using pugixml."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "pugixml-devel-1.13-1.4.aarch64.rpm"
RPM_HASH = "21e11247a9ace0e555d8552affa682f5ddebef0a7f23ad9f9abca3ad25afa4fb3c57b60c777040e34e70db255dffa824801bbf96a09fcdb6439936665291c17a"

RPROVIDES:${PN} += "cmake-pugixml \
pkgconfig-pugixml \
pugixml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpugixml1"

inherit rpm
