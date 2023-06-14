SUMMARY = "Haskell unicode-data library development files"
DESCRIPTION = "This package provides the Haskell unicode-data library development files."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-devel-0.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "8347e824b7a9c2e4e676f23d2168975f4f0345c1849353c38f36255b236e9eee28dd4fb43713c88bb4aa8570f6d6f48575c234a75484279bddfd474f0c764cad"

RPROVIDES:${PN} += "ghc-devel-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-unicode-data-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-unicode-data"

inherit rpm
