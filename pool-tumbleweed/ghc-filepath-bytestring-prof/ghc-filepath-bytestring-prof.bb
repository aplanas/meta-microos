SUMMARY = "Haskell filepath-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell filepath-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.12"

RPM_NAME = "ghc-filepath-bytestring-prof-1.4.2.1.12-1.3.aarch64.rpm"
RPM_HASH = "44092862b8c1965d7189c336ea123f89c6a650dd2174e54ed22eebce769604befc7a371e56b4a519e4fb53f32248bad1e9726f73c1671b51b157273f66f4c849"

RPROVIDES:${PN} += "ghc-filepath-bytestring-prof \
ghc-prof-filepath-bytestring-1.4.2.1.12-j7n9rVANDcF3su3QaU7xU"

RDEPENDS:${PN} += "ghc-filepath-bytestring-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-unix-2.7.3"

inherit rpm
