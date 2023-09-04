SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-hppa-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "e7013a5d32dcfee7fe4ac54bba0d1ba6cc4a21a87ffa5266fdb5d5c91c07b377a98b8a04d528798b966b4a33760ffb127230bc3fe5e2d320276d987800389029"

RPROVIDES:${PN} += "cross-hppa-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
