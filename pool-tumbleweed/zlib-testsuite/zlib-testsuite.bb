SUMMARY = "Provide the test examples to reproduce test suite"
DESCRIPTION = "To run the testsuite, execute /usr/libexec/zlib/testsuite \
 \
It should exit 0"
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "zlib-testsuite-1.2.13-4.1.aarch64.rpm"
RPM_HASH = "1ceb5b77beeccb31311b42612deb1233d57fd3bcd1cdb3f04cce022da75ffc3f523f636e61f1862cfdc49349edaead35e8ca80c7511997c0ac467881d43882a5"

RPROVIDES:${PN} += "zlib-testsuite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libz1"

inherit rpm
