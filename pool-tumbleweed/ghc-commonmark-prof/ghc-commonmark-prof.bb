SUMMARY = "Haskell commonmark profiling library"
DESCRIPTION = "This package provides the Haskell commonmark profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-commonmark-prof-0.2.3-1.2.aarch64.rpm"
RPM_HASH = "1601a3c6419192cb45402b7c09c836fa9797d55cde1e122206f199c4028150e4d8760d6bdfe6f27ddc71bb8461ad7d09a2cdf6d6753ee1b1b524bc746c1f122d"

RPROVIDES:${PN} += "ghc-commonmark-prof \
ghc-prof-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G"

RDEPENDS:${PN} += "ghc-commonmark-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-prof-unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO"

inherit rpm
