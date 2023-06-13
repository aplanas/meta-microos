SUMMARY = "C++ implementation of a fast hash map and hash set using robin hood hashing"
DESCRIPTION = "The robin-map library is a C++ implementation of a fast hash map and hash set \
using open-addressing and linear robin hood hashing with backward shift \
deletion to resolve collisions. \
 \
Four classes are provided: tsl::robin_map, tsl::robin_set, tsl::robin_pg_map \
and tsl::robin_pg_set. The first two are faster and use a power of two growth \
policy, the last two use a prime growth policy instead and are able to cope \
better with a poor hash function. Use the prime version if there is a chance of \
repeating patterns in the lower bits of your hash (e.g. you are storing \
pointers with an identity hash function). See GrowthPolicy for details. \
 \
A benchmark of tsl::robin_map against other hash maps may be found here. This \
page also gives some advices on which hash table structure you should try for \
your use case (useful if you are a bit lost with the multiple hash tables \
implementations in the tsl namespace)."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "robin-map-devel-1.2.1-1.1.noarch.rpm"
RPM_HASH = "f4a9591468b39e72aaeea9efe60766480ae873bbbb0b5493fe911a18dcb9bedfe5918cc3b7021a56a1513be14b0c2e3322ea52873348906a104539e1863fd0d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(tsl-robin-map) \
robin-map-devel"

RDEPENDS:${PN} += ""

inherit rpm
