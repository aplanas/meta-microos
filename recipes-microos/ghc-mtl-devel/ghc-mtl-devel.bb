SUMMARY = "Haskell mtl library development files"
DESCRIPTION = "This package provides the Haskell mtl library development files."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-devel-2.2.2-3.1.aarch64.rpm"
RPM_HASH = "620fcdfb88fa90c200da9fd033fd78a270db8734becd53856853ff9852760e4f08bd87b10ceb8e6e582631b53305d16380365e60c667781eb46bff5fca5f8da2"

RPROVIDES:${PN} += "ghc-devel(mtl-2.2.2) ghc-mtl-devel ghc-mtl-devel(aarch-64) ghc-mtl-static ghc-mtl-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(transformers-0.5.6.2) ghc-mtl(aarch-64)"

inherit rpm
