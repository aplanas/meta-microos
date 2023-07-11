SUMMARY = "Haskell mtl profiling library"
DESCRIPTION = "This package provides the Haskell mtl profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-prof-2.2.2-3.2.aarch64.rpm"
RPM_HASH = "227a42b91ce07755f1b76fc2f341f685d778fd181db98813b415be5f7239fe6abd3192e65afae10ebe30c477a0aec4b3a00184b2290fe4ba99a02850157efca6"

RPROVIDES:${PN} += "ghc-mtl-prof \
ghc-prof-mtl-2.2.2"

RDEPENDS:${PN} += "ghc-mtl-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
