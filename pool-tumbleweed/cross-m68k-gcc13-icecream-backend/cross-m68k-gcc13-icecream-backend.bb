SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-m68k-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "b43c26b6bdfe94af81d9e179b53dea76639644703021386d4aacf18c66588ec4d2af509c9aab62bef5019ba403b3ab1e72bd12a5f7c070ebcb761b7adad8ca4e"

RPROVIDES:${PN} += "cross-m68k-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
