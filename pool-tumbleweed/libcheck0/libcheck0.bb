SUMMARY = "Unit Test Framework for C"
DESCRIPTION = "Check is a unit test framework for C. It features a simple interface for \
defining unit tests, limitating the developer the less possible. Tests \
are run in a separate address space, so Check cancatch both, assertion \
failures and code errors that cause segmentationfaults or other \
signals. The output of unit tests can be used within source code \
editors and IDEs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.2"

RPM_NAME = "libcheck0-0.15.2-2.10.aarch64.rpm"
RPM_HASH = "a183f08e79426c1b23bc03c827403cc40c92df1209d22a05ed5af3ca005b8894bed88714edf08ad48733a2cd6d09f55833ad6f88fb03d0d61445ad4698673580"

RPROVIDES:${PN} += "check \
libcheck.so.0()(64bit) \
libcheck0 \
libcheck0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
