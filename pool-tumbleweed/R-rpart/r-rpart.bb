SUMMARY = "Package provides recommended R-rpart"
DESCRIPTION = "This packages provides R-rpart, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.1.19"

RPM_NAME = "R-rpart-4.1.19-46.1.aarch64.rpm"
RPM_HASH = "18d290b640d2f6ee682cf3aab526feafc9e6d5e0042b27b03df340bb04dba50d66dfeadf76b4714bb2d106e84a07e05ffe3899e81443fe82c75196878b507211"

RPROVIDES:${PN} += "R-rpart"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
