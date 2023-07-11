SUMMARY = "Library implementing the Raft consensus protocol"
DESCRIPTION = "This library is a fully asynchronous C implementation of the Raft consensus protocol. \
 \
It implements the core Raft algorithm logic and a pluggable interface defining I/O for \
networking and persistent storage. The algorithm supports leadership election, \
log replication, log compaction, and  membership changes. \
 \
A stock implementation of the I/O interface based on libuv is included."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "0.17.1"

RPM_NAME = "libraft3-0.17.1-1.4.aarch64.rpm"
RPM_HASH = "1ce339c28b6f5e44aa0753b84deb17186224ab157fad8831c5a858ee36679c1861798f2ba92e869df0bf6056943391766c188ed376ac00600f64c648f6124109"

RPROVIDES:${PN} += "libraft.so.3 \
libraft3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libuv.so.1"

inherit rpm
