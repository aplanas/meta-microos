SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-x86_64-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "bfc8392746c42ce66f21541164794ac6c847a69292c527c0ae5024fb683a4f2a0d756df20c16e80dd800208edf0dc2da67231df25e63b46e6367bfb7147d0fbc"

RPROVIDES:${PN} += "cross-x86-64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
