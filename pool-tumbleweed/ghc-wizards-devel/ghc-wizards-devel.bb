SUMMARY = "Haskell wizards library development files"
DESCRIPTION = "This package provides the Haskell wizards library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-devel-1.0.3-6.3.aarch64.rpm"
RPM_HASH = "e9c63b17601c6d81692f1aeedf1444941e73d1dad66e51d8b9d1ae7a54e0e8bee024d2ed803ff1a4789e536329de544de3f28de4cdfaff5ef2ed28fe7efc0877"

RPROVIDES:${PN} += "ghc-devel-wizards-1.0.3-1eOj2T9eMm8Jj6cnosVGZb \
ghc-wizards-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-control-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7 \
ghc-devel-haskeline-0.8.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-wizards"

inherit rpm
