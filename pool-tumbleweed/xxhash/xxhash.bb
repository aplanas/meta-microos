SUMMARY = "Non-cryptographic hash algorithm"
DESCRIPTION = "xxHash is a hash algorithm. It completes the SMHasher test suite which \
evaluates collision, dispersion and randomness qualities of hash functions. \
Hashes are identical on all platforms."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "0.8.1"

RPM_NAME = "xxhash-0.8.1-3.3.aarch64.rpm"
RPM_HASH = "b1abdd9f23eee0e42b05e462d75611ba63fdf4dbb4526899a1087e82fbf4ab2efbb1aa1ad45b333ca96f39dfbaa2334251a74bbb574a1c6d190fd61fcbe9ba3b"

RPROVIDES:${PN} += "xxhash \
xxhash(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
