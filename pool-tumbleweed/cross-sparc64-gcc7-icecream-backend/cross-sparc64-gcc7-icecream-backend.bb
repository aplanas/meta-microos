SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc64-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "44b8b6c36b46c06c82e4c83c1772608b4fa3b1416735e358528294a81559d568f69686c763d89fbe7628829fbcb30fabd1fcaf38b6beba4f0c1b40a2cc67d991"

RPROVIDES:${PN} += "cross-sparc64-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
