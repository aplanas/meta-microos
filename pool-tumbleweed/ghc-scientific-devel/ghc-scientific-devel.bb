SUMMARY = "Haskell scientific library development files"
DESCRIPTION = "This package provides the Haskell scientific library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-devel-0.3.7.0-5.6.aarch64.rpm"
RPM_HASH = "1f4a471956a404386654eacc5f993177fe098cc0157818655ca6a31e644c56819726661309e4750ecaa0052770b70bd59451f9e3fbac20e61ada1c68c67337db"

RPROVIDES:${PN} += "ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-scientific-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-integer-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-scientific"

inherit rpm
