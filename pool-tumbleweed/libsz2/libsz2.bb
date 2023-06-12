SUMMARY = "Lossless compression library for scientific data"
DESCRIPTION = "Lossless compression library for scientific data. Libsz2 is a drop-in \
replacement for the SZIP library (http://www.hdfgroup.org/doc_resource/SZIP)."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "libsz2-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "e559ddb785cb7882628638720bdc3af1a3bff7578875a327a8a195d56a3888d7f917b2e04189e3765c11b030058d10fe52928d883edcf77684557c316f99d0aa"

RPROVIDES:${PN} += "libsz.so.2()(64bit) \
libsz2 \
libsz2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
