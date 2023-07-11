SUMMARY = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
DESCRIPTION = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libstdc++-gdb-printer-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "ce23e4635adfe99fb22aad3244740ec1ce088e9cf82fa520b29b8d5ea19311703e6f05f945e481133a04820011c9fde7db64968e483120fba85e9ac5272e5850"

RPROVIDES:${PN} += "mingw64-libstdc++-gdb-printer"

RDEPENDS:${PN} += ""

inherit rpm
