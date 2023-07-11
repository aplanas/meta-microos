SUMMARY = "Haskell xhtml library development files"
DESCRIPTION = "This package provides the Haskell xhtml library development files."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-devel-3000.2.2.1-3.2.aarch64.rpm"
RPM_HASH = "0be3620b899251bfa1e9b3f2a59d2b5522bf8762666edcdb1470b816c835cb8aa15d2b06d4ad935b9110275b00d66a8f9453a8f35a69864955e5a6039f2c6769"

RPROVIDES:${PN} += "ghc-devel-xhtml-3000.2.2.1 \
ghc-xhtml-devel \
ghc-xhtml-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-xhtml"

inherit rpm
