SUMMARY = "Wrapper for AWK interpreter"
DESCRIPTION = "RunAWK is a small wrapper for AWK interpreter that helps to write \
the standalone programs in AWK. It provides modules for AWK \
similar to PERL's 'use' command and other powerful features. \
Dozens of ready to use modules are also provided."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "runawk-1.6.1-1.19.aarch64.rpm"
RPM_HASH = "6a20de62ae85301e0b4945a901580fb0b3df289b749c54056e636c0f088699577df0095e9f28f52f72330a7b5af339d8bfedb101a7041225caf5ea23a8fb479d"

RPROVIDES:${PN} += "runawk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
