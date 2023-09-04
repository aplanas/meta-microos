SUMMARY = "X Window System"
DESCRIPTION = "The 32bit pattern complementing x11_enhanced."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11_enhanced-32bit-20200505-42.1.aarch64.rpm"
RPM_HASH = "f9c15bd6c323954fb5ad6741835dfbe43afd271815895ec709c2d23339e14a93865bb565496578a1e025e4d73dfcc4375ab82284243b37623a94742501846b4f"

RPROVIDES:${PN} += "pattern- \
patterns-base-x11-enhanced-32bit"

RDEPENDS:${PN} += ""

inherit rpm
