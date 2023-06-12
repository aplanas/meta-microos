SUMMARY = "Haskell deriving-aeson library development files"
DESCRIPTION = "This package provides the Haskell deriving-aeson library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "ghc-deriving-aeson-devel-0.2.9-2.2.aarch64.rpm"
RPM_HASH = "aef4e6bc22431ffaca65400cb5e8d60f388d9bc3f81557e4e6c020e052b384e697f47c071de86fe06b6cb699d9d5cc1d6e4646d363170cce9824badec2b08f26"

RPROVIDES:${PN} += "ghc-deriving-aeson-devel \
ghc-deriving-aeson-devel(aarch-64) \
ghc-devel(deriving-aeson-0.2.9-HkCtwpD3IaS9WeJeVKU34M)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-deriving-aeson \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(base-4.17.1.0)"

inherit rpm
