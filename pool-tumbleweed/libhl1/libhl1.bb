SUMMARY = "HashLink library"
DESCRIPTION = "This subpackage provides the libhl library for HashLink."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "libhl1-1.13-1.4.aarch64.rpm"
RPM_HASH = "a9f47161300b21e6533becddf9950971fcf3f925e83cb99d77fc20432386427309581160b7a25a099f8d34e2d1a936d0e41c1cec369ee7535a32a627ab72e890"

RPROVIDES:${PN} += "libhl.so.1 \
libhl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
