SUMMARY = "Shared library for xxHash - a non-cryptographic hash algorithm"
DESCRIPTION = "Shared library for xxHash - a hash algorithm. It completes the SMHasher test \
suite which evaluates collision, dispersion and randomness qualities of hash \
functions. Hashes are identical on all platforms."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "libxxhash0-0.8.1-3.4.aarch64.rpm"
RPM_HASH = "62adde8a0802f48a94a9b53f6a8c5bd0640c4a46b99935c62e864bf760ffe8cdb45f6813aa1b674e1fb752cdd23dad52f57974d124c9ab8369fa6f2d05458893"

RPROVIDES:${PN} += "libxxhash.so.0 \
libxxhash0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
