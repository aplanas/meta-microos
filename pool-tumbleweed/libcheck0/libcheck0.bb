SUMMARY = "Unit Test Framework for C"
DESCRIPTION = "Check is a unit test framework for C. It features a simple interface for \
defining unit tests, limitating the developer the less possible. Tests \
are run in a separate address space, so Check cancatch both, assertion \
failures and code errors that cause segmentationfaults or other \
signals. The output of unit tests can be used within source code \
editors and IDEs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "libcheck0-0.15.2-2.11.aarch64.rpm"
RPM_HASH = "9af5ff5d94d232d9b090511acdfa4a668c6e558173c64377603125fab28cf4b21360487dd09e813392bc7b204b1f157b224a38e0cec3a734a20621c386cef6d0"

RPROVIDES:${PN} += "check \
libcheck.so.0 \
libcheck0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
