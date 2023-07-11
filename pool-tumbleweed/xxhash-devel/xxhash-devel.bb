SUMMARY = "Development files for xxHash - a non-cryptographic hash algorithm"
DESCRIPTION = "Development files for xxHash - a hash algorithm. It completes the SMHasher test \
suite which evaluates collision, dispersion and randomness qualities of hash \
functions. Hashes are identical on all platforms."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "xxhash-devel-0.8.1-3.4.aarch64.rpm"
RPM_HASH = "6b89ec7e6e4b1a8b2eb8f48f19d2f593a42e437fad0ab1c7cd89ade9648c08cc823338e1d5d606ba6920739ec3c81b842938174a728d86428a9c8ac5c9a2bf26"

RPROVIDES:${PN} += "pkgconfig-libxxhash \
xxhash-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxxhash0 \
xxhash"

inherit rpm
