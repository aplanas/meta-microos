SUMMARY = "Haskell stm profiling library"
DESCRIPTION = "This package provides the Haskell stm profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-prof-2.5.1.0-1.1.aarch64.rpm"
RPM_HASH = "2024e688d44a212dd9f3905011aaa38f0f32fcca606988e7628cdc89af44ebc2c34bd44269776caa52c2a1e8d8facb7875a1219b2508202c8c0a8875bccd3563"

RPROVIDES:${PN} += "ghc-prof(stm-2.5.1.0) ghc-stm-prof ghc-stm-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-stm-devel(aarch-64)"

inherit rpm
