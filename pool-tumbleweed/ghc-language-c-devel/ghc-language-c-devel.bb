SUMMARY = "Haskell language-c library development files"
DESCRIPTION = "This package provides the Haskell language-c library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-devel-0.9.2-2.6.aarch64.rpm"
RPM_HASH = "bf2ff30b16a587a8fb1e1134cada648b85c0a1ab758dca694ff47c9cd181371929d1c7db49679f868e1439ad15832dd09ca331849a3a211e6afc67b5901f0d3f"

RPROVIDES:${PN} += "ghc-devel-language-c-0.9.2-5l7vUWhvlwnEvBOKlkChTz \
ghc-language-c-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.16.0 \
ghc-language-c"

inherit rpm
