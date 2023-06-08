SUMMARY = "Haskell microlens-mtl profiling library"
DESCRIPTION = "This package provides the Haskell microlens-mtl profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.3"

RPM_NAME = "ghc-microlens-mtl-prof-0.2.0.3-2.2.aarch64.rpm"
RPM_HASH = "a3c6e560fdb2f10aab56ef52db321d5ba9059a610b4bc7b0fbb72e23c8909b228ba139d65a8dbdf32083b7b6c99a0f1d2473d25edacd8dfdb7af99f2ced4f99d"

RPROVIDES:${PN} += "ghc-microlens-mtl-prof ghc-microlens-mtl-prof(aarch-64) ghc-prof(microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV)"
RDEPENDS:${PN} += "ghc-microlens-mtl-devel ghc-prof(base-4.17.1.0) ghc-prof(microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1) ghc-prof(mtl-2.2.2) ghc-prof(transformers-0.5.6.2) ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
