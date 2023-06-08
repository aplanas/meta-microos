SUMMARY = "Haskell strict profiling library"
DESCRIPTION = "This package provides the Haskell strict profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-strict-prof-0.4.0.1-6.3.aarch64.rpm"
RPM_HASH = "10f1958484762c164ebffad5abceabdbfd3d44f64146f074943f617c8d3699bb77fb5ffb479550e8013180650e16032346129734b6edc53c91747148822323b0"

RPROVIDES:${PN} += "ghc-prof(strict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi) ghc-strict-prof ghc-strict-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(assoc-1.0.2-IAwklVGxRFw6xcadvaWWl7) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-prof(text-2.0.2) ghc-prof(these-1.1.1.1-3POHYes25uBIW53bcrDd39) ghc-prof(transformers-0.5.6.2) ghc-strict-devel"

inherit rpm
