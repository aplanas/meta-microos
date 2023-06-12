SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-m68k-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "92d4a8a742b87b8932c7d307d9d000b0e50b56fd70f2989ea43f0482f9fb938874cf7f0dfcfebb62eb0144d331d7ca3dc18426d2d8b4a108a221a7b585d18c7c"

RPROVIDES:${PN} += "cross-m68k-gcc13-icecream-backend \
cross-m68k-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
