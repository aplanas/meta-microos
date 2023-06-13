SUMMARY = "Test packages for PMIx"
DESCRIPTION = "Test binaries which allow to test proper PMIx operations."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-test-3.2.3-10.1.aarch64.rpm"
RPM_HASH = "ddf2d08dbd25535ad3cdd3c62c2d7075f4fa7b4a2262e2bbedd5bf60a0eba7f48154e1847c4ceecdc1cd896587a80b088bbff7672b357e17568995df3512e053"

RPROVIDES:${PN} += "pmix-test \
pmix-test(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevent_core-2.1.so.7()(64bit) \
libpmix.so.2()(64bit)"

inherit rpm
