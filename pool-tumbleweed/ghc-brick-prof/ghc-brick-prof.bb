SUMMARY = "Haskell brick profiling library"
DESCRIPTION = "This package provides the Haskell brick profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-prof-1.6-2.8.aarch64.rpm"
RPM_HASH = "c4cd8bc701d7dcc876977d7f68d4d73f1c061ab6778d3f31f53bced88cc14df6124a0d00ed429307fc2a3900980cd8992fa1c3fbe95146d33769ae64f46d946a"

RPROVIDES:${PN} += "ghc-brick-prof \
ghc-prof-brick-1.6-4v0wxiRveIdSVqWhw7elI"

RDEPENDS:${PN} += "ghc-brick-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bimap-0.5.0-3nKyJuRybYg2I5XOsBhwKE \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-config-ini-0.2.6.0-FZ1GgaSPQSr5D8UkvN7nbq \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-prof-data-clist-0.2-LT5UCpKeur34zcxFsnpoqW \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-prof-microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV \
ghc-prof-microlens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C \
ghc-prof-mtl-2.2.2 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-text-zipper-0.12-HAxIdT2NfEj1pbIOe2MIin \
ghc-prof-unix-2.7.3 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-vty-5.38-IuSWPYXCscY5LxGEJl3fAP \
ghc-prof-word-wrap-0.5-8lP0dTi9CAzDFiJFYJ3rcZ"

inherit rpm
