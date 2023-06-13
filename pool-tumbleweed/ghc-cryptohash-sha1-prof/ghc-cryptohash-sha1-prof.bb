SUMMARY = "Haskell cryptohash-sha1 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-prof-0.11.101.0-4.3.aarch64.rpm"
RPM_HASH = "7db0f1d3530f1b0b395c37ff0367c33bad91a5bc2744862cd7ccc34eaa73780b8eb10073eb9ed978cdca8c0bbcaa33a174c29d1b680dcc872df87ee09eb06f38"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-prof \
ghc-cryptohash-sha1-prof(aarch-64) \
ghc-prof(cryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb)"

RDEPENDS:${PN} += "ghc-cryptohash-sha1-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0)"

inherit rpm
