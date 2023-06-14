SUMMARY = "Development files for xxHash - a non-cryptographic hash algorithm"
DESCRIPTION = "Development files for xxHash - a hash algorithm. It completes the SMHasher test \
suite which evaluates collision, dispersion and randomness qualities of hash \
functions. Hashes are identical on all platforms."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "xxhash-devel-0.8.1-3.3.aarch64.rpm"
RPM_HASH = "2c4f9ba8cd03c4e1b37f984823af8067f3c14c68763c4e209d44de578360c50a26d991313c1fd6cd5c8eb60174d9ccfcdfb0292fcfdb18f97d6dbd064049c5c7"

RPROVIDES:${PN} += "pkgconfig-libxxhash \
xxhash-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxxhash0 \
xxhash"

inherit rpm
