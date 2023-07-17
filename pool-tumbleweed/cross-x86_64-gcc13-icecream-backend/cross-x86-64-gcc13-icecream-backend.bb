SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-x86_64-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "5a42cf30bd2a196a3002b5a4732d165cc6793de0b6b5d31e0ad477f22ccca342d7fa5c07c735ee23d41519b622f3bc6d7aba939564bafa7b4d840ca8796ecfbf"

RPROVIDES:${PN} += "cross-x86-64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
