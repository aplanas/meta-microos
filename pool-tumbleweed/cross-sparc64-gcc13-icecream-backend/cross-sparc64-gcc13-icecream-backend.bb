SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-sparc64-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "a6cb5171f90b9625e47c2b1ba83146de549ff71fc9cb164851609477ba0f4d5526898000929e3febd126ac45bf48de06ee131732dfb4f467f66194cf5500f5a5"

RPROVIDES:${PN} += "cross-sparc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
