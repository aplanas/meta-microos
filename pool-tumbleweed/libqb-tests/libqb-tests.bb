SUMMARY = "Test suite for libqb"
DESCRIPTION = "The libqb-tests package contains the libqb test suite."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.6+20220323.758044b"

RPM_NAME = "libqb-tests-2.0.6+20220323.758044b-1.3.aarch64.rpm"
RPM_HASH = "f6ccf04be361f7702e5b0585acd7bba65fe584c23ebf08fd96850be7d23ae567101722628b80f39ac866183b9816f46dac221ef41f11cdbe1ef8d635a1173931"

RPROVIDES:${PN} += "libqb-tests \
libqb-tests(aarch-64) \
libstat_wrapper.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcheck.so.0()(64bit) \
libqb.so.100()(64bit)"

inherit rpm
