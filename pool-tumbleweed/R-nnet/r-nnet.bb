SUMMARY = "Package provides recommended R-nnet"
DESCRIPTION = "This packages provides R-nnet, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.18"

RPM_NAME = "R-nnet-7.3.18-45.2.aarch64.rpm"
RPM_HASH = "bdee540f4b88d4db426515719abed53a517010913970b9bdc9b26d8fc313b270878f1221c18b450552b8541fe599d3e60613f82c4718ef17bcfeed4a41fbb92c"

RPROVIDES:${PN} += "R-nnet \
R-nnet(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
