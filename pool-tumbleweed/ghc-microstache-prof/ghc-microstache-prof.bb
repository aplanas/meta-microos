SUMMARY = "Haskell microstache profiling library"
DESCRIPTION = "This package provides the Haskell microstache profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.3"

RPM_NAME = "ghc-microstache-prof-1.0.2.3-3.5.aarch64.rpm"
RPM_HASH = "38672f43c997ebc03988dcf9d212d5d292095b3f61c8593148dfe76e0580317c2d04e414a411a007ec994cc84044d8f5e0f4844d81e0a1f3c0a9d118a1f85312"

RPROVIDES:${PN} += "ghc-microstache-prof \
ghc-prof-microstache-1.0.2.3-KBculmnRicB9ztvZCFpDOs"

RDEPENDS:${PN} += "ghc-microstache-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
