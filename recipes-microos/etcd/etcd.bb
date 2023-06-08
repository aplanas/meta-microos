SUMMARY = "Highly-available key value store for configuration and service discovery"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery, with a focus on being: \
 \
- Simple: well-defined, user-facing API (gRPC) \
- Secure: automatic TLS with optional client cert authentication \
- Fast: benchmarked 10,000 writes/sec \
- Reliable: properly distributed using Raft"
LICENSE = "Apache-2.0"

PV = "3.5.8"

RPM_NAME = "etcd-3.5.8-1.1.aarch64.rpm"
RPM_HASH = "94ff540682a4c62de003450977e246f31bbdd41389c7a8d748582c6d145a6a229fc0e2d5f682a365523b06a34b72792c3bdfddbe0739956a2728f7c304f7d18c"

RPROVIDES:${PN} += "etcd etcd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup sysuser-shadow"

inherit rpm
