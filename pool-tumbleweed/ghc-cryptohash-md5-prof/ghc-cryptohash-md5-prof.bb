SUMMARY = "Haskell cryptohash-md5 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-prof-0.11.101.0-4.8.aarch64.rpm"
RPM_HASH = "eff169b83f6fa330f2e6c25af9d456c7035441dc17451b7ab47b7ef31381553935f54f59e4606449175d478f06795aabfcad61c1c7a56b9b5ac3531f8d3b5e25"

RPROVIDES:${PN} += "ghc-cryptohash-md5-prof \
ghc-prof-cryptohash-md5-0.11.101.0-DA2NKKN1mDy6fcPl6be7xQ"

RDEPENDS:${PN} += "ghc-cryptohash-md5-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
