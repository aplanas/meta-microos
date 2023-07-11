SUMMARY = "Provide the test examples to reproduce test suite"
DESCRIPTION = "To run the testsuite, execute /usr/libexec/zlib/testsuite \
 \
It should exit 0"
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "zlib-testsuite-1.2.13-4.2.aarch64.rpm"
RPM_HASH = "9c6d3dc0c5882c1905c289f3da3e4ac3cf91c0139edefc1e82152eb3cf086dc0c61db1455811e4ea14dccd43a609690d8193367d79e910afd1931ab145570fb7"

RPROVIDES:${PN} += "zlib-testsuite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libz1"

inherit rpm
