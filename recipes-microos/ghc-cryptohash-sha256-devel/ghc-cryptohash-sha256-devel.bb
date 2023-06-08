SUMMARY = "Haskell cryptohash-sha256 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-devel-0.11.102.1-3.3.aarch64.rpm"
RPM_HASH = "ab6bd7ffae3352822bdc107ae1f70ff77c0be6f15add42844b9805c4b96e3dfa8a8a8a8e7d0a59561af21f8aac7b133ca746c8c1c49b4b1e4ea2130d495ec829"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-devel ghc-cryptohash-sha256-devel(aarch-64) ghc-devel(cryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-cryptohash-sha256 ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0)"

inherit rpm
