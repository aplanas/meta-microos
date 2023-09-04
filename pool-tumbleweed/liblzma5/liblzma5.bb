SUMMARY = "Lempel–Ziv–Markov chain algorithm compression library"
DESCRIPTION = "Library for encoding/decoding LZMA files."
LICENSE = "SUSE-Public-Domain"

PV = "5.4.4"

RPM_NAME = "liblzma5-5.4.4-2.1.aarch64.rpm"
RPM_HASH = "1b60d22042d344a5f8d873177cf7ecaf4eda37aeb0fd3589022aa4ccd6e5ae6dd019feb65db49e9f6e98ce89b285be7d29d6a15e14ccd024d2e961e2dd13b7cd"

RPROVIDES:${PN} += "liblzma.so.5 \
liblzma5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
