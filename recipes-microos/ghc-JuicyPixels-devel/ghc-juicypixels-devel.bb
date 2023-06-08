SUMMARY = "Haskell JuicyPixels library development files"
DESCRIPTION = "This package provides the Haskell JuicyPixels library development files."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-devel-3.3.8-1.3.aarch64.rpm"
RPM_HASH = "1dd18acb73a2e6f83321f03e2820b76e8cdc0c99747f98e25f0e82bfec5cb87d2f47a569ce63aebf86e6269900ea3ae8d6d695bc536e67c142e649a28d40ee01"

RPROVIDES:${PN} += "ghc-JuicyPixels-devel ghc-JuicyPixels-devel(aarch-64) ghc-devel(JuicyPixels-3.3.8-BQPF2mBCFFj3rGPaZ8nrGS)"
RDEPENDS:${PN} += "/bin/sh ghc-JuicyPixels ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(mtl-2.2.2) ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-devel(transformers-0.5.6.2) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-devel(zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk)"

inherit rpm
