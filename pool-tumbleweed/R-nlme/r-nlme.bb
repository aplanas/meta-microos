SUMMARY = "Package provides recommended R-nlme"
DESCRIPTION = "This packages provides R-nlme, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.1.162"

RPM_NAME = "R-nlme-3.1.162-45.2.aarch64.rpm"
RPM_HASH = "22b99db86b8b0dbae2a6562bc5299360ca9f625717ccf35f30ae84d2b78c29b57b0932349dca6fb88758ce7d56191f6b91c0f6eb2eed0111abfd897d84705eea"

RPROVIDES:${PN} += "R-nlme \
R-nlme(aarch-64)"
RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
