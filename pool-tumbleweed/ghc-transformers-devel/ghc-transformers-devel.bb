SUMMARY = "Haskell transformers library development files"
DESCRIPTION = "This package provides the Haskell transformers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-devel-0.5.6.2-1.1.aarch64.rpm"
RPM_HASH = "af59f627b32acee5e66bda5f3542bb88cd3da968f53568b9689e0ac8f9b25923f3038d03d19834871ec242e606418442f5001a90c436259bc6a8e7ac484aa7df"

RPROVIDES:${PN} += "ghc-devel-transformers-0.5.6.2 \
ghc-transformers-devel \
ghc-transformers-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-transformers"

inherit rpm
