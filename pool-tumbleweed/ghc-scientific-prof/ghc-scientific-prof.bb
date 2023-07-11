SUMMARY = "Haskell scientific profiling library"
DESCRIPTION = "This package provides the Haskell scientific profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-prof-0.3.7.0-5.6.aarch64.rpm"
RPM_HASH = "0436ca94799334077a77f86178e21bf5b20243650302e68435866294cc153ba79a5d38eee6667fe4024b5748d024f45d654eaeea633762c6cc29510afebc7394"

RPROVIDES:${PN} += "ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-scientific-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-integer-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-scientific-devel"

inherit rpm
