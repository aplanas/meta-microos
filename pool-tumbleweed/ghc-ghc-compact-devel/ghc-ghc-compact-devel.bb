SUMMARY = "Haskell ghc-compact library development files"
DESCRIPTION = "This package provides the Haskell ghc-compact library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-devel-0.1.0.0-3.1.aarch64.rpm"
RPM_HASH = "c0d4598841b9e275acba3a895e49d1e986837e4ee6ec6404f0039fd8f51e0b0e6ec32e2f4b72ffed7bbae1c617c2d855ebf4badfb2695a0d88fec2376d6dd1e1"

RPROVIDES:${PN} += "ghc-devel-ghc-compact-0.1.0.0 \
ghc-ghc-compact-devel \
ghc-ghc-compact-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-ghc-compact"

inherit rpm
