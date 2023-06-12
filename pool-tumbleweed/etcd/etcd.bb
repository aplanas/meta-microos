SUMMARY = "Highly-available key value store for configuration and service discovery"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery, with a focus on being: \
 \
- Simple: well-defined, user-facing API (gRPC) \
- Secure: automatic TLS with optional client cert authentication \
- Fast: benchmarked 10,000 writes/sec \
- Reliable: properly distributed using Raft"
LICENSE = "Apache-2.0"

PV = "3.5.9"

RPM_NAME = "etcd-3.5.9-1.1.aarch64.rpm"
RPM_HASH = "8dc8da2a383733054b61e9578af7bc51f753db0de443355109a6613abb3f275e9300c1f552688dfc8f6fcbaf325e3440956d20bebc44d97b4950ae70a3c580cb"

RPROVIDES:${PN} += "etcd \
etcd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
sysuser-shadow"

inherit rpm
