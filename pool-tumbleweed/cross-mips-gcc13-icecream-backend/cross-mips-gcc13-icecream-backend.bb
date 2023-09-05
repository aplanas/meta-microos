SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-mips-gcc13-icecream-backend-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "fc297b73a25dacbc9b13c88c5d644b43b3359efdcd1ed900800daa758e18c18b6c0fbb8e235d5bc943047a52914140168c18732a2ba02497e29ed63b26e46846"

RPROVIDES:${PN} += "cross-mips-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
