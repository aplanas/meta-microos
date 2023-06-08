SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-mips-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "f9b6b587e5bf6b6bc16d574b2c4fb5e32ff17908ff322897a99d1a190e022dbc389c25ed521f0089faa074fc65cd8871777a50681828c1efbbde439a0b22dff1"

RPROVIDES:${PN} += "cross-mips-gcc13-icecream-backend cross-mips-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
