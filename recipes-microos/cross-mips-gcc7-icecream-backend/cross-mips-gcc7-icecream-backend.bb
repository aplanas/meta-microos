SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-mips-gcc7-icecream-backend-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "3cfb096bf03bb2dcedc18e7ab97284b768f4611c8f59d340f3994c9a1ab37a645691b6cd33d6674c1a56a29cfe60eff39b56d7a51ee5648c4b5160b459b10997"

RPROVIDES:${PN} += "cross-mips-gcc7-icecream-backend cross-mips-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
