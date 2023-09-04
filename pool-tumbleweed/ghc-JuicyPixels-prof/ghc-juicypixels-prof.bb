SUMMARY = "Haskell JuicyPixels profiling library"
DESCRIPTION = "This package provides the Haskell JuicyPixels profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-prof-3.3.8-1.8.aarch64.rpm"
RPM_HASH = "8f10bd388f99dd75890f8ebfa68f5ae28d9f92987044b18d7b2a3e5de0b24c5a3a4ce33725f5f591aa61e7e03f664fb621d8b5ddf092f7591d27c0d422f75578"

RPROVIDES:${PN} += "ghc-JuicyPixels-prof \
ghc-prof-JuicyPixels-3.3.8-FOv2aUt11Hi1sMHjbd6508"

RDEPENDS:${PN} += "ghc-JuicyPixels-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj"

inherit rpm
