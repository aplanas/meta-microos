SUMMARY = "Development files for the Raft library implementation of the consensus protocol"
DESCRIPTION = "This library is a fully asynchronous C implementation of the Raft consensus protocol. \
 \
It implements the core Raft algorithm logic and a pluggable interface defining I/O for \
networking and persistent storage. The algorithm supports leadership election, \
log replication, log compaction, and  membership changes. \
 \
This package contains the files necessary for developing and building applications \
using the library."
LICENSE = "LGPL-3.0-only-WITH-LGPL-3.0-linking-exception"

PV = "0.17.1"

RPM_NAME = "raft-devel-0.17.1-1.3.aarch64.rpm"
RPM_HASH = "66bf3869156da979ffdddf997da6e934b30cc00498b730652532c7a408b806ac27c2b9d0dd9f262081cfc4eed175a6be62d7e562f8a60a2339f44dff356e9448"

RPROVIDES:${PN} += "pkgconfig-raft \
raft-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraft3 \
pkgconfig-libuv"

inherit rpm
