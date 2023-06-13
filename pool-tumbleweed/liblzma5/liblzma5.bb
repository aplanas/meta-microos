SUMMARY = "Lempel–Ziv–Markov chain algorithm compression library"
DESCRIPTION = "Library for encoding/decoding LZMA files."
LICENSE = "SUSE-Public-Domain"

PV = "5.4.3"

RPM_NAME = "liblzma5-5.4.3-1.1.aarch64.rpm"
RPM_HASH = "6b0c32d6fa40f03251bb64da10293909f8e2f149a6e6c398e02137fa1cf70cb941f9c58693db6741608bc475bc25ca8cdfdf4974c5c3ed46cc531008cf9834e7"

RPROVIDES:${PN} += "liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
liblzma.so.5(XZ_5.1.2alpha)(64bit) \
liblzma.so.5(XZ_5.2)(64bit) \
liblzma.so.5(XZ_5.2.2)(64bit) \
liblzma.so.5(XZ_5.4)(64bit) \
liblzma5 \
liblzma5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
