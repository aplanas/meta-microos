SUMMARY = "Test packages for PMIx"
DESCRIPTION = "Test binaries which allow to test proper PMIx operations."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-test-3.2.3-10.2.aarch64.rpm"
RPM_HASH = "bed440ee8e2bd6da08fda07682678e21d5be56fcdac96b153d6c8eee32ec68cda3a3e59953365137ee9a75b35b814c02a0bfa2e28c1e383918b6bf2eca87683d"

RPROVIDES:${PN} += "pmix-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libpmix.so.2"

inherit rpm
