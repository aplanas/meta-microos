SUMMARY = "Haskell deepseq library development files"
DESCRIPTION = "This package provides the Haskell deepseq library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-devel-1.4.8.0-3.2.aarch64.rpm"
RPM_HASH = "9b91164d9dca7902927240ca473669a26f06a572de3df90eef14da1f4404cbc02992eef97e31a3812f9f0ea914cfcfa1b10ee9a8b36f4fa57533c21d750c7857"

RPROVIDES:${PN} += "ghc-deepseq-devel \
ghc-deepseq-static \
ghc-devel-deepseq-1.4.8.0"

RDEPENDS:${PN} += "ghc-compiler \
ghc-deepseq \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0"

inherit rpm
