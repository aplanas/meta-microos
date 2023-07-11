SUMMARY = "Haskell brick library development files"
DESCRIPTION = "This package provides the Haskell brick library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-devel-1.6-2.8.aarch64.rpm"
RPM_HASH = "d8e5b13f30c3aa69999601e2e37f0faf65c6abc88cb78fe6da70ec7a5cc3c0133968407ddd7a10040c4bbf8fa18f7475655e4370d2d35288fa8be4dabf7aa24a"

RPROVIDES:${PN} += "ghc-brick-devel \
ghc-devel-brick-1.6-4v0wxiRveIdSVqWhw7elI"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-brick \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bimap-0.5.0-3nKyJuRybYg2I5XOsBhwKE \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-config-ini-0.2.6.0-FZ1GgaSPQSr5D8UkvN7nbq \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-devel-data-clist-0.2-LT5UCpKeur34zcxFsnpoqW \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-devel-microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV \
ghc-devel-microlens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C \
ghc-devel-mtl-2.2.2 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-text-zipper-0.12-HAxIdT2NfEj1pbIOe2MIin \
ghc-devel-unix-2.7.3 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-vty-5.38-IuSWPYXCscY5LxGEJl3fAP \
ghc-devel-word-wrap-0.5-8lP0dTi9CAzDFiJFYJ3rcZ"

inherit rpm
