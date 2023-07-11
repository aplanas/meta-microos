SUMMARY = "CUnit shared library"
DESCRIPTION = "CUnit is a unit testing framework for C. \
This package installs the CUnit shared library."
LICENSE = "LGPL-2.0"

PV = "2.1.3"

RPM_NAME = "libcunit1-2.1.3-5.27.aarch64.rpm"
RPM_HASH = "bfc6001de6a57ea9012ebb6ccc6d3037e34a37bcf66346725bc15145a68a7c54df8a08b54f87bd8438835e83703edf3ff203c7d48c5d29867fd7293cda2f207b"

RPROVIDES:${PN} += "libcunit.so.1 \
libcunit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
