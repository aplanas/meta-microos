SUMMARY = "Haskell JuicyPixels profiling library"
DESCRIPTION = "This package provides the Haskell JuicyPixels profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-prof-3.3.8-1.3.aarch64.rpm"
RPM_HASH = "b2fe971f602c8871a7741d339f1e6762e7e0aafaba9717583c9003d6ce5e6dc1a70183be63848599db2ee112d4fca3be531fb1301182f349257b34d9048e1f69"

RPROVIDES:${PN} += "ghc-JuicyPixels-prof ghc-JuicyPixels-prof(aarch-64) ghc-prof(JuicyPixels-3.3.8-BQPF2mBCFFj3rGPaZ8nrGS)"
RDEPENDS:${PN} += "ghc-JuicyPixels-devel ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(mtl-2.2.2) ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-prof(transformers-0.5.6.2) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-prof(zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk)"

inherit rpm
