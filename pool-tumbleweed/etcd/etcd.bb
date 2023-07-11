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

RPM_NAME = "etcd-3.5.9-1.2.aarch64.rpm"
RPM_HASH = "f171514c7104f7303ffd53dd52cb679310d546afcbb6a45fad65bd3a5d840e35cc636f7b1d597da2b4e606721f1125b14031c5db9c0f94d9c9bbc38922306f9b"

RPROVIDES:${PN} += "etcd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
sysuser-shadow"

inherit rpm
