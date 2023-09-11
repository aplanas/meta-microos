SUMMARY = "Haskell hadolint library development files"
DESCRIPTION = "This package provides the Haskell hadolint library development files."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "ghc-hadolint-devel-2.12.0-1.15.aarch64.rpm"
RPM_HASH = "94341e8294e6bf8974dd4838be1c12540874569d54cb7e439ee38b37646c708f6afb15fee9b3e660c2781d2a9f86f1c42ba12a8b80993aaefddd974758fd4165"

RPROVIDES:${PN} += "ghc-devel-hadolint-2.12.0-62A5MRq9SpbFZTKd7vE5be \
ghc-hadolint-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-HsYAML-0.2.1.1-LCJxHEstqYgA5FP8nPmMDQ \
ghc-devel-ShellCheck-0.9.0-TBi9P689024G2PjJ0tZqq \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-colourista-0.1.0.2-19lLFYWP0ZEDfSw3obIpeF \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-email-validate-2.3.2.19-qAeQdfI4jV1bzSPjytegN \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-foldl-1.4.15-K48qSoToNSs4RlpGcmzHlW \
ghc-devel-gitrev-1.3.1-9Q0DldHbAfz2pygdzHH3jX \
ghc-devel-ilist-0.4.0.1-9dvbAvSibn3BQOkPCJFvsJ \
ghc-devel-language-docker-11.0.0-2HEqMTVikVZEgpsCXsz3Cq \
ghc-devel-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-devel-parallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-devel-semver-0.4.0.1-7FEVHDXnoZsE6NqAZNLXlb \
ghc-devel-spdx-1.0.0.3-4SEI6zaM8QU9eQO97OlzoR \
ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-timerep-2.1.0.0-IaSai5sQyvSEzoXHpabvZQ \
ghc-devel-void-0.7.3-GhXmDKlBHl0LbXoxVMxAU0 \
ghc-hadolint"

inherit rpm
