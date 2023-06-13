SUMMARY = "Files needed for development using memcached protocol"
DESCRIPTION = "Memcached is a high-performance, distributed memory object caching \
system, generic in nature, but intended for use in speeding up dynamic \
web applications by alleviating database load. \
 \
This package contains development files"
LICENSE = "BSD-3-Clause"

PV = "1.6.19"

RPM_NAME = "memcached-devel-1.6.19-1.3.aarch64.rpm"
RPM_HASH = "3310bc1bf29b58e09ad3b3856db97a12eb67eb417691b00c76a83f39787f19e4d1cdeecdd71e018022db4dd3bdc9764f7bfe1734ce8e0ca72ee3887ffd1f3353"

RPROVIDES:${PN} += "memcached-devel \
memcached-devel(aarch-64)"

RDEPENDS:${PN} += "memcached"

inherit rpm
