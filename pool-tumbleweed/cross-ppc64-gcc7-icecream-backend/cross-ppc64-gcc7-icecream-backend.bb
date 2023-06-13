SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "64f3508b398b8be88bf489352a4a51d55e486eaf4067db54f991294984cbd16df740e0171c41a78a34bec801192614d7df166c52324081b101d99f9076c957ae"

RPROVIDES:${PN} += "cross-ppc64-gcc7-icecream-backend \
cross-ppc64-gcc7-icecream-backend(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
