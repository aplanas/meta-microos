SUMMARY = "Files needed for development using memcached protocol"
DESCRIPTION = "Memcached is a high-performance, distributed memory object caching \
system, generic in nature, but intended for use in speeding up dynamic \
web applications by alleviating database load. \
 \
This package contains development files"
LICENSE = "BSD-3-Clause"

PV = "1.6.21"

RPM_NAME = "memcached-devel-1.6.21-1.1.aarch64.rpm"
RPM_HASH = "578131e5aecc4546ee87cf25b646ae5caef121f27c4ff4a74dfe20ae3e6d2b5a5b902f9d709c0bd4ea43fe3dd34b22a1ca62b868e338617596cbeb816a919ab7"

RPROVIDES:${PN} += "memcached-devel"

RDEPENDS:${PN} += "memcached"

inherit rpm
