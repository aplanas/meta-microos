SUMMARY = "Haskell language-c library development files"
DESCRIPTION = "This package provides the Haskell language-c library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-devel-0.9.2-2.8.aarch64.rpm"
RPM_HASH = "9d59bd464b7ae275e0b1ea059aebae600bfac1a91edba7fa04dc219d0b2a0286c9cec7cd3f925ed731df74a54d92d116ef46da9827683544af0e9f79b2cb78c9"

RPROVIDES:${PN} += "ghc-devel-language-c-0.9.2-Ao2qt71CS5kEu13HVpHpG1 \
ghc-language-c-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.17.0 \
ghc-language-c"

inherit rpm
