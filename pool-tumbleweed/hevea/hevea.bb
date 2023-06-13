SUMMARY = "A fast LaTeX to HTML translator"
DESCRIPTION = "HEVEA is a LaTeX to HTML translator.  The input language is a fairly \
complete subset of LaTeX2e (old LaTeX style is also accepted) and \
the output language is HTML."
LICENSE = "LGPL-2.0-only & QPL-1.0"

PV = "2.36"

RPM_NAME = "hevea-2.36-1.7.aarch64.rpm"
RPM_HASH = "2aa89e2ea736ce1da6921a9edc0040c7aea28b3ca8cdd358ad678c86b10ad9e90edf5e37680378322d5de196c01d13b015ec284b28840eedcd167fc9298142cd"

RPROVIDES:${PN} += "hevea \
hevea(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
