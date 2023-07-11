SUMMARY = "Package provides recommended R-nnet"
DESCRIPTION = "This packages provides R-nnet, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.19"

RPM_NAME = "R-nnet-7.3.19-46.1.aarch64.rpm"
RPM_HASH = "6475c57f0f7360d5a9e6b2899c0cae201a7344fc8bb092d12d2cfa55c21bf6e8fdd31b1e8bf4c88bb2bfbb8efc2b758369896202504344cb6e3153fe47ec66c1"

RPROVIDES:${PN} += "R-nnet"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
