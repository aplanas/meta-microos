SUMMARY = "Haskell cryptohash-sha1 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-prof-0.11.101.0-4.6.aarch64.rpm"
RPM_HASH = "3a7d86df14660c304c97a1e7794f99050e3d629281a8f06554206b18ce1b9746483599d091e489c73f5ea860abe1f8802f9e9280034ea2693b475978cf47e0d8"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-prof \
ghc-prof-cryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb"

RDEPENDS:${PN} += "ghc-cryptohash-sha1-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0"

inherit rpm
