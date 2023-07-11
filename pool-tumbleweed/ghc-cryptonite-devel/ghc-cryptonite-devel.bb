SUMMARY = "Haskell cryptonite library development files"
DESCRIPTION = "This package provides the Haskell cryptonite library development files."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-devel-0.30-2.6.aarch64.rpm"
RPM_HASH = "498f0ae171e87435a7c08e2906ddcdd97a007dccd47787d19d65178e2104070391d6efebbc5b11c9abff4d5b8c711466d510ebc2dcf59b038c6823bbe0d9ca86"

RPROVIDES:${PN} += "ghc-cryptonite-devel \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptonite \
ghc-devel-base-4.17.1.0 \
ghc-devel-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-integer-gmp-1.1 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
glibc-devel"

inherit rpm
