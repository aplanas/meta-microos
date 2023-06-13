SUMMARY = "Development Files for KMyMoney"
DESCRIPTION = "Development files and headers need to build software using KMyMoney."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.1.3"

RPM_NAME = "kmymoney-devel-5.1.3-2.10.aarch64.rpm"
RPM_HASH = "d1c88948408b4ed50b7491d7c1d932a48e26115b220c18becec6d8ece358c16af2659e90508198f48d6e2094b1f45193607bf3d1325a9752f5e13bf663687955"

RPROVIDES:${PN} += "kmymoney-devel \
kmymoney-devel(aarch-64)"

RDEPENDS:${PN} += "kmymoney"

inherit rpm
