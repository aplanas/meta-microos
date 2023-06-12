SUMMARY = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
DESCRIPTION = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libstdc++-gdb-printer-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "dc099e4f2b2610b77482208ac92371b885cca015192e292e9d262f30f6ba6786df5427a284f54cdade9218393097db64f6b8b15a3d334cb0430a8474b8f7a8d1"

RPROVIDES:${PN} += "mingw32-libstdc++-gdb-printer \
mingw32-libstdc++-gdb-printer(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
