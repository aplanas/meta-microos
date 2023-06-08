SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-x86_64-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "a51e9203d4eb6ceba0840827348be6620cefaccc7c32dd0712e951517dd8b7e80fd626ff6f518833a6e3476266ed712498ca83784c5ba86590d4ef3702df1534"

RPROVIDES:${PN} += "cross-x86_64-gcc13-icecream-backend cross-x86_64-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
