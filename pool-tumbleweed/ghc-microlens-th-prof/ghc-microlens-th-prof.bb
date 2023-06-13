SUMMARY = "Haskell microlens-th profiling library"
DESCRIPTION = "This package provides the Haskell microlens-th profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.12"

RPM_NAME = "ghc-microlens-th-prof-0.4.3.12-1.2.aarch64.rpm"
RPM_HASH = "5da8f5f29b2525ae7c5916c0a02c2872abc3db2999dc3baa559151da0519e1d52545e9f3f5ea8540fccccd2ddc3b73d75a203935cf8cbcabc276fc87c5f027b4"

RPROVIDES:${PN} += "ghc-microlens-th-prof \
ghc-microlens-th-prof(aarch-64) \
ghc-prof(microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG)"

RDEPENDS:${PN} += "ghc-microlens-th-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
