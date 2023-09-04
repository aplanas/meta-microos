SUMMARY = "Haskell JuicyPixels library development files"
DESCRIPTION = "This package provides the Haskell JuicyPixels library development files."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-devel-3.3.8-1.8.aarch64.rpm"
RPM_HASH = "fa25e6abaf7573f0cb50cb9125554c0c07b5201e5c19371f21232b1761d4bc58ba559dd7506bb076dfb7f6be9d8a0be5b1bda29f4fc97143bb065605050a0dcd"

RPROVIDES:${PN} += "ghc-JuicyPixels-devel \
ghc-devel-JuicyPixels-3.3.8-FOv2aUt11Hi1sMHjbd6508"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-JuicyPixels \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj"

inherit rpm
