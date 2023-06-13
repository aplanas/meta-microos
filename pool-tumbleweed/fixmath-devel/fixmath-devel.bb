SUMMARY = "Header files for fixmath, a fixed-point math library"
DESCRIPTION = "fixmath is a fixed-point math operations library written in C and \
implementing the Q16.16 format. \
 \
This package contains the headers."
LICENSE = "MIT"

PV = "2022.07.20"

RPM_NAME = "fixmath-devel-2022.07.20-5.1.noarch.rpm"
RPM_HASH = "9f6448724b1d2904930a9add25df988fc89299becec460eab039b07a381cafe25bfdbc119bf048656522ef8fac5028fd5b603dbb7aad3cdf123add508f5cf688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fixmath-devel"

RDEPENDS:${PN} += "fixmath"

inherit rpm
