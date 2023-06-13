SUMMARY = "Package provides recommended R-cluster"
DESCRIPTION = "This packages provides R-cluster, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.4"

RPM_NAME = "R-cluster-2.1.4-45.2.aarch64.rpm"
RPM_HASH = "e836ebf4362a3c85df1b5cbb0789dc3f002bbaabcb05d9bed768fd35b7681950ca524bba5584428bb49b36280a5ed148440ac80b1574974e874ebcf4af9d5cfc"

RPROVIDES:${PN} += "R-cluster \
R-cluster(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
libR.so()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
