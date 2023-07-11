SUMMARY = "Non-cryptographic hash algorithm"
DESCRIPTION = "xxHash is a hash algorithm. It completes the SMHasher test suite which \
evaluates collision, dispersion and randomness qualities of hash functions. \
Hashes are identical on all platforms."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "0.8.1"

RPM_NAME = "xxhash-0.8.1-3.4.aarch64.rpm"
RPM_HASH = "6145ffbf88c52fde91520bbdacb59b327882ce7cdc6feb8a356a6fbf4966f2cd32fb8afd883d0f73a1a615b1416738b2012b1906000e83f5b5cdd5cd10027f02"

RPROVIDES:${PN} += "xxhash"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
