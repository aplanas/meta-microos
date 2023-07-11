SUMMARY = "Development package for LASH"
DESCRIPTION = "This package contains the library for the LASH system."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "liblash1-0.5.4-2.12.aarch64.rpm"
RPM_HASH = "f203ef97089d182946b7a4b5129b9a7b1b5b9841727c7b467d67210a5a67a9d26a6b5e10abed6dee9d60b738d4b76575ced2a53f1fc0fc221187e395eebad9d8"

RPROVIDES:${PN} += "liblash.so.1 \
liblash1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
