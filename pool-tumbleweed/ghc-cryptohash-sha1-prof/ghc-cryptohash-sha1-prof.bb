SUMMARY = "Haskell cryptohash-sha1 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-prof-0.11.101.0-4.8.aarch64.rpm"
RPM_HASH = "812df77b9b7478e53875dd0fa15ebc0bc4a660831535bf0133fe3d422d3c88ba892d85fb91e1d1e8a4026813faddbe4a8dcea21f9e635bbe0a5987e98589f68f"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-prof \
ghc-prof-cryptohash-sha1-0.11.101.0-6Awf3EmibUqDJxbZJLf3j4"

RDEPENDS:${PN} += "ghc-cryptohash-sha1-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
