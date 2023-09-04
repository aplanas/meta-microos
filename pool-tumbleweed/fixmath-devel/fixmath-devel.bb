SUMMARY = "Header files for fixmath, a fixed-point math library"
DESCRIPTION = "fixmath is a fixed-point math operations library written in C and \
implementing the Q16.16 format. \
 \
This package contains the headers."
LICENSE = "MIT"

PV = "2022.07.20"

RPM_NAME = "fixmath-devel-2022.07.20-6.1.noarch.rpm"
RPM_HASH = "f74077c57816fef5fad69a5ea0993fd7738570c5c62b22576f07e1ab9da8a0dfcc47b48a6ca00877c373cb0bc2a0d51ecc057a0f99554e9c871e10417f99321d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fixmath-devel"

RDEPENDS:${PN} += "fixmath"

inherit rpm
