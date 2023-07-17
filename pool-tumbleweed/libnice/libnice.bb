SUMMARY = "Interactive Connectivity Establishment implementation"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "libnice-0.1.21-3.1.aarch64.rpm"
RPM_HASH = "05e0792f48c9899f17e31ca67e8bd1b2506735378e5c7c8ccc2c2c330635d7135178d108c21fc594015d0d231dc24d4df0e7dc1bfe6cac8b477b4a502b8c3fa9"

RPROVIDES:${PN} += "libnice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30"

inherit rpm
