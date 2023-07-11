SUMMARY = "Haskell language-c profiling library"
DESCRIPTION = "This package provides the Haskell language-c profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-prof-0.9.2-2.6.aarch64.rpm"
RPM_HASH = "bb9e4107c1be72e0f5dbed50accda49058c827a39109a774311a260626b1b23f6b5bd128eff87e1ec1ce5b75026d2e59cf9276b1a05efbf09f8f08da8cffffb2"

RPROVIDES:${PN} += "ghc-language-c-prof \
ghc-prof-language-c-0.9.2-5l7vUWhvlwnEvBOKlkChTz"

RDEPENDS:${PN} += "ghc-language-c-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.16.0"

inherit rpm
