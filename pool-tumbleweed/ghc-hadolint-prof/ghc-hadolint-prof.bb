SUMMARY = "Haskell hadolint profiling library"
DESCRIPTION = "This package provides the Haskell hadolint profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "ghc-hadolint-prof-2.12.0-1.15.aarch64.rpm"
RPM_HASH = "cbd5c8da2887cb7f75bceb24826c2422a9f6839527edfa567b3fa5382a3def1be6f7dd15a670ff60d1adb17684040b87641c7893748c893fbeed77b8d9654138"

RPROVIDES:${PN} += "ghc-hadolint-prof \
ghc-prof-hadolint-2.12.0-62A5MRq9SpbFZTKd7vE5be"

RDEPENDS:${PN} += "ghc-hadolint-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-HsYAML-0.2.1.1-LCJxHEstqYgA5FP8nPmMDQ \
ghc-prof-ShellCheck-0.9.0-TBi9P689024G2PjJ0tZqq \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-colourista-0.1.0.2-19lLFYWP0ZEDfSw3obIpeF \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-email-validate-2.3.2.19-qAeQdfI4jV1bzSPjytegN \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-foldl-1.4.15-K48qSoToNSs4RlpGcmzHlW \
ghc-prof-gitrev-1.3.1-9Q0DldHbAfz2pygdzHH3jX \
ghc-prof-ilist-0.4.0.1-9dvbAvSibn3BQOkPCJFvsJ \
ghc-prof-language-docker-11.0.0-2HEqMTVikVZEgpsCXsz3Cq \
ghc-prof-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-prof-parallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-prof-semver-0.4.0.1-7FEVHDXnoZsE6NqAZNLXlb \
ghc-prof-spdx-1.0.0.3-4SEI6zaM8QU9eQO97OlzoR \
ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-timerep-2.1.0.0-IaSai5sQyvSEzoXHpabvZQ \
ghc-prof-void-0.7.3-GhXmDKlBHl0LbXoxVMxAU0"

inherit rpm
