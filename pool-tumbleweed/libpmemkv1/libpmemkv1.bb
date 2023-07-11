SUMMARY = "Key/Value Datastore for Persistent Memory"
DESCRIPTION = "pmemkv is a local/embedded key-value datastore optimized for persistent memory. \
Rather than being tied to a single language or backing implementation, `pmemkv` \
provides different options for language bindings and storage engines."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "libpmemkv1-1.5.0-1.2.aarch64.rpm"
RPM_HASH = "1634e5eba4dee9bbc62b1e7eadb35effbdb172513e06c0e16c4cd7db51c93b4141233924d1a2e085293cf6f7252ea465c736ea68651d3612284423fa22968f90"

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
