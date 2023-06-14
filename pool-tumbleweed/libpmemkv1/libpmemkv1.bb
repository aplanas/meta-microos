SUMMARY = "Key/Value Datastore for Persistent Memory"
DESCRIPTION = "pmemkv is a local/embedded key-value datastore optimized for persistent memory. \
Rather than being tied to a single language or backing implementation, `pmemkv` \
provides different options for language bindings and storage engines."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "libpmemkv1-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "402951e69d1a4d7259c99a7d65689b46de90c5b90073a9b039c163f7619dfb5893c1ba0666c52436c6e840b0073b101a2eeb1a74225da92a95c906a30aba7478"

RPROVIDES:${PN} += "libpmemkv.so.1 \
libpmemkv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmemkind.so.0 \
libpmemkv-json-config1 \
libpmemobj.so.1 \
libstdc++.so.6"

inherit rpm
