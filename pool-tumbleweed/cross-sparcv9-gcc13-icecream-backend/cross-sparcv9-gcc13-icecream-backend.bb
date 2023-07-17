SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-sparcv9-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "f63528ede1298975f6f2c87d5433832391ee206df625f394cccdef39471600f1b0e2da8b35d0fc3e31a942aac53603955c22338f41fa65ae24809cc40fbb9b9b"

RPROVIDES:${PN} += "cross-sparcv9-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
