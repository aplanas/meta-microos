SUMMARY = "Haskell pandoc-types library development files"
DESCRIPTION = "This package provides the Haskell pandoc-types library development files."
LICENSE = "GPL-2.0-only"

PV = "1.23"

RPM_NAME = "ghc-pandoc-types-devel-1.23-1.3.aarch64.rpm"
RPM_HASH = "efbe6073fb2f3fcac4627a78ae5d852db4cf46bdfea4e8cd3eac21425d480e90f97967c3f917b2ba00aec17e2891048558f868aea2eec5c0fa969986c9559cfd"

RPROVIDES:${PN} += "ghc-devel(pandoc-types-1.23-EFziwPO22I72D2SxHphq63) \
ghc-pandoc-types-devel \
ghc-pandoc-types-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6) \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-pandoc-types"

inherit rpm
