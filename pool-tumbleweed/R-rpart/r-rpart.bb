SUMMARY = "Package provides recommended R-rpart"
DESCRIPTION = "This packages provides R-rpart, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.1.19"

RPM_NAME = "R-rpart-4.1.19-45.2.aarch64.rpm"
RPM_HASH = "412cee4a5216e44c8c23b0f2500744a545e247aafa892d079bf1e19a7ae20f4c501e90530d7266de897df6c4b00db2d4d19e847c3e9b4ca7062b57bd02a10a9f"

RPROVIDES:${PN} += "R-rpart \
R-rpart(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
libR.so()(64bit) \
libc.so.6()(64bit)"

inherit rpm
