SUMMARY = "Haskell JuicyPixels library development files"
DESCRIPTION = "This package provides the Haskell JuicyPixels library development files."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-devel-3.3.8-1.6.aarch64.rpm"
RPM_HASH = "bf5799d3dce04825ea66398a0daf76d6a08f663211df92f0480e711d0701aedc57c48dca6737cc9339a22b9fbd895b99be633eaa6dc74c3d6b4f998319f1b7f7"

RPROVIDES:${PN} += "ghc-JuicyPixels-devel \
ghc-devel-JuicyPixels-3.3.8-BQPF2mBCFFj3rGPaZ8nrGS"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-JuicyPixels \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk"

inherit rpm
