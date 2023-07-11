SUMMARY = "Extensive Archive Format Library"
DESCRIPTION = "The XAR project aims to provide an easily extensible archive format. Important \
design decisions include an easily extensible XML table of contents for random \
access to archived files, storing the toc at the beginning of the archive to \
allow for efficient handling of streamed archives, the ability to handle files \
of arbitrarily large sizes, the ability to choose independent encodings for \
individual files in the archive, the ability to store checksums for individual \
files in both compressed and uncompressed form, and the ability to query the \
table of content's rich meta-data."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "libxar1-1.6.1-7.1.aarch64.rpm"
RPM_HASH = "37741e8fbce552d3808b6087195ea876afe57194f4b7ce77398900ecf5b5809ea9710eeb6ef3869096a1e69375a644471bbfae3f4892d6a5a6c19621922fa9ce"

RPROVIDES:${PN} += "libxar.so.1 \
libxar1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
libxml2.so.2 \
libz.so.1"

inherit rpm
