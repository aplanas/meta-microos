SUMMARY = "Header files for fixmath, a fixed-point math library"
DESCRIPTION = "fixmath is a fixed-point math operations library written in C and \
implementing the Q16.16 format. \
 \
This package contains the headers."
LICENSE = "MIT"

PV = "2022.07.20"

RPM_NAME = "fixmath-devel-2022.07.20-5.2.noarch.rpm"
RPM_HASH = "71f03a29db324272e503f562f6c9574299eaaf97c881de814dab16e33a01f65aa098d92ba46eaddf57b0aa44e5b0ab4cb7322ab80f97af2cb75bb656e1da43aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fixmath-devel"

RDEPENDS:${PN} += "fixmath"

inherit rpm
