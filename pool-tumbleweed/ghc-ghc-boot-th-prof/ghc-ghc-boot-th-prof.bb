SUMMARY = "Haskell ghc-boot-th profiling library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-prof-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "1cf901feb269d451257ecb3a3366104129fbcf5a28abf35e17614230013f3e17a6261318f4d71e54da30143400b353b8d10c6dd1ee727738f81a99124196d063"

RPROVIDES:${PN} += "ghc-ghc-boot-th-prof \
ghc-prof-ghc-boot-th-9.4.5"

RDEPENDS:${PN} += "ghc-ghc-boot-th-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
