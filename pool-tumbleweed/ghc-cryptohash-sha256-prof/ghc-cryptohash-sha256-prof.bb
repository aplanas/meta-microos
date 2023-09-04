SUMMARY = "Haskell cryptohash-sha256 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-prof-0.11.102.1-3.8.aarch64.rpm"
RPM_HASH = "1519baf47414033d8d7ed98e5421115fc1b443802404a6b5d47d6ae48c85807c63ae16d658bdcee213846a3e8602e436a56b87021a097802dda00f3e28f65efb"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-prof \
ghc-prof-cryptohash-sha256-0.11.102.1-53jMaIynRosaQ7D7Mdzyr"

RDEPENDS:${PN} += "ghc-cryptohash-sha256-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
