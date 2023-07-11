SUMMARY = "Memory-efficient C++ hash_map implementation"
DESCRIPTION = "The Google SparseHash project contains several C++ template hash-map \
implementations with different performance characteristics, including \
an implementation that optimizes for space and one that optimizes for \
speed."
LICENSE = "BSD-3-Clause"

PV = "2.0.4"

RPM_NAME = "sparsehash-devel-2.0.4-1.10.aarch64.rpm"
RPM_HASH = "1fe2b8ad9eadae827b4639d555b8afba292b71b64b9152fa12d4d6f7de13eb458d5685d9fe221e3d36a1f698e7829aa08fd592ad2ac24754e86e649c9d45748e"

RPROVIDES:${PN} += "pkgconfig-libsparsehash \
sparsehash-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
