SUMMARY = "Package providing R-core packages R-compiler"
DESCRIPTION = "This package provides R-compiler, one of the R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-compiler-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "1c9cce946f820ca05a74654a360ff2fd7e2146dfc8a9127ebcda4b121ec21997c17682feb5a7b97f2ead8b60c8f2a04077f3aeee2374956b5ea09384fba6f029"

RPROVIDES:${PN} += "R-compiler"

RDEPENDS:${PN} += "R-base"

inherit rpm
