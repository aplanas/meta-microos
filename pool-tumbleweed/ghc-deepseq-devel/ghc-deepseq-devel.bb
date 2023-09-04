SUMMARY = "Haskell deepseq library development files"
DESCRIPTION = "This package provides the Haskell deepseq library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-devel-1.4.8.0-1.1.aarch64.rpm"
RPM_HASH = "5dea2a0ac01ffd8fd7689f2f65cd4f2a092488e0923f67e257950145d6faa1348a990acd5edc7c92511465a83b8e9f585d66072407d0c086c1e9261be0e28078"

RPROVIDES:${PN} += "ghc-deepseq-devel \
ghc-deepseq-static \
ghc-devel-deepseq-1.4.8.0"

RDEPENDS:${PN} += "ghc-compiler \
ghc-deepseq \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-prim-0.9.1"

inherit rpm
