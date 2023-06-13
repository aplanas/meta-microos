SUMMARY = "SCTP test tool"
DESCRIPTION = "TSCTP is an SCTP test tool. Its purpose is to perform basic SCTP \
functionality tests to check implementations interoperability and \
to verify that the SCTP stack is working."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "tsctp-0.7.4-1.12.aarch64.rpm"
RPM_HASH = "bd18619b6edbf08bfa672af47b8f0db5d3e1bb8e7dbed7d8895b1956dc24963a8c7c8dd9b8d2908681ebe3660b0695c01668b8b3573f753fd050c216fb48b177"

RPROVIDES:${PN} += "tsctp \
tsctp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsctp.so.1()(64bit) \
libsctp.so.1(VERS_1)(64bit)"

inherit rpm
