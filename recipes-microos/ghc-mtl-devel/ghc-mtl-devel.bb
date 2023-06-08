SUMMARY = "Haskell mtl library development files"
DESCRIPTION = "This package provides the Haskell mtl library development files."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-devel-2.2.2-1.1.aarch64.rpm"
RPM_HASH = "3eeb31c19b09bbe49f510fa1c00bba4c5dac53895d478fb258d5cf9522a11cf134e1f6d3d8b3f80b9321f2f0f3e5a97fb2d479da6a7aace930734b0a40b9b750"

RPROVIDES:${PN} += "ghc-devel(mtl-2.2.2) ghc-mtl-devel ghc-mtl-devel(aarch-64) ghc-mtl-static ghc-mtl-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(transformers-0.5.6.2) ghc-mtl(aarch-64)"

inherit rpm
