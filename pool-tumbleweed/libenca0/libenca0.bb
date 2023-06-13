SUMMARY = "Header files and libraries for Enca development"
DESCRIPTION = "The enca-devel package contains the static libraries and header files \
for writing programs using the Extremely Naive Charset Analyser library, \
and its API documentation. \
 \
Install enca-devel if you are going to create applications using the Enca \
library."
LICENSE = "GPL-2.0-only"

PV = "1.19"

RPM_NAME = "libenca0-1.19-2.4.aarch64.rpm"
RPM_HASH = "f71dbbd31b2c990d50a61ac28f078694ecf0de1f86d23119866b9e79d9636f9c4715961d80698ad681ad9572b82698a732358ebe7f0765d3b2eabaa734f950be"

RPROVIDES:${PN} += "libenca.so.0()(64bit) \
libenca0 \
libenca0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
