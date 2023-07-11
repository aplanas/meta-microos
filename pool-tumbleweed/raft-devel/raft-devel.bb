SUMMARY = "Development files for the Raft library implementation of the consensus protocol"
DESCRIPTION = "This library is a fully asynchronous C implementation of the Raft consensus protocol. \
 \
It implements the core Raft algorithm logic and a pluggable interface defining I/O for \
networking and persistent storage. The algorithm supports leadership election, \
log replication, log compaction, and  membership changes. \
 \
This package contains the files necessary for developing and building applications \
using the library."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "0.17.1"

RPM_NAME = "raft-devel-0.17.1-1.4.aarch64.rpm"
RPM_HASH = "7eb5b0a8acb89a1c7b4715a2c200f27e89feca5ad2681bd1ea1d77fca5539ace966bb5c11dfbbe49d2d8beb756e5760cc8367348441583482387f814337b0c8d"

RPROVIDES:${PN} += "pkgconfig-raft \
raft-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraft3 \
pkgconfig-libuv"

inherit rpm
