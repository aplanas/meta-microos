SUMMARY = "Package provides recommended R-codetools"
DESCRIPTION = "This packages provides R-codetools, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.2.19"

RPM_NAME = "R-codetools-0.2.19-45.1.aarch64.rpm"
RPM_HASH = "c1cbee79ca206cd5e19ada75544ec030d3932d789a9793edcb50e95035ca59170a00720e0920c78acad400e4093732890dce1af357a1aa6f8302888b6d5ee77c"

RPROVIDES:${PN} += "R-codetools R-codetools(aarch-64)"
RDEPENDS:${PN} += "R-base"

inherit rpm
