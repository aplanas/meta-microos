SUMMARY = "Haskell cryptohash-md5 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-prof-0.11.101.0-4.6.aarch64.rpm"
RPM_HASH = "5b8f800a1e6c0e9c12a4966e8533e8aa24b09b1b7b90c242f8dce2b58406ad73685f33993f214b02b08ea6479d6fc6b80f3069afca626e924678d51d7e367395"

RPROVIDES:${PN} += "ghc-cryptohash-md5-prof \
ghc-prof-cryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV"

RDEPENDS:${PN} += "ghc-cryptohash-md5-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0"

inherit rpm
