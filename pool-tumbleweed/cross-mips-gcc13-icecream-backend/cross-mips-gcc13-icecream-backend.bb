SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-mips-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "b1f442f3af306ab55a97022fea6f9ea2e9f365a5d03da76f3ec0220cccba2733c94e3d1d9cfa4dd12ff62b67591cd43a9ed236c43e6577c2d907ba6ef39b6ce7"

RPROVIDES:${PN} += "cross-mips-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
