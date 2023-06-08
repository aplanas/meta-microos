SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-ppc64le-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "52f1e23f643effbaee7d69aa654e56026e9e0a03a2e6c4d2d2c90430654297ee7949411de1ebe47d506fd8b6db60091e4f9a76dd4dc6ac8356bd6b8ce1e544e9"

RPROVIDES:${PN} += "cross-ppc64le-gcc13-icecream-backend cross-ppc64le-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
