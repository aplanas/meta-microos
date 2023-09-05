SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-hppa-gcc13-icecream-backend-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "75778b4f68b8d7297f38959d3aaf1af4bc0fe1059e42d0331ce6cdf654f10345116af15a385d4b72b50413c25e7e2864f1438b909c13eb955d7c85f17a7d1ef1"

RPROVIDES:${PN} += "cross-hppa-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
