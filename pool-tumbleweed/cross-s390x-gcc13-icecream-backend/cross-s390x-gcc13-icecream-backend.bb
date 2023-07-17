SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-s390x-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "90d5751864ee7dc1af4771b0dd24b4014d34b6f97585048423d8548667f6f6ebe4144f2256df36ac47ffaf45205b06414b39b3f2c2ba72d5c8b7aecf2dbca837"

RPROVIDES:${PN} += "cross-s390x-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
