SUMMARY = "Haskell JuicyPixels profiling library"
DESCRIPTION = "This package provides the Haskell JuicyPixels profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-prof-3.3.8-1.6.aarch64.rpm"
RPM_HASH = "c89664facabaeed4d2990adb8a41b5ccf5db3a9ed0289cabadbbf369569ee13035ed721507ec537cc266e891310c67864b63075189fe69eb7549784172997e2d"

RPROVIDES:${PN} += "ghc-JuicyPixels-prof \
ghc-prof-JuicyPixels-3.3.8-BQPF2mBCFFj3rGPaZ8nrGS"

RDEPENDS:${PN} += "ghc-JuicyPixels-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk"

inherit rpm
