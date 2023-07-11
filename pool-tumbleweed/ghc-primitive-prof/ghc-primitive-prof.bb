SUMMARY = "Haskell primitive profiling library"
DESCRIPTION = "This package provides the Haskell primitive profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-prof-0.7.4.0-1.6.aarch64.rpm"
RPM_HASH = "bd2180fe54dc98c5e782611e3f4e427a365575c7d734b5a320144df23e049e1232d80c53f00358fbbf02729767fe28702560665facf7ffa8005bb1b06521748e"

RPROVIDES:${PN} += "ghc-primitive-prof \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq"

RDEPENDS:${PN} += "ghc-primitive-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
