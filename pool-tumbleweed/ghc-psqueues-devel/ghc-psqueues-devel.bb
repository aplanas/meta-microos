SUMMARY = "Haskell psqueues library development files"
DESCRIPTION = "This package provides the Haskell psqueues library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-devel-0.2.7.3-2.9.aarch64.rpm"
RPM_HASH = "71121749ff4cc620d54079d3f725b977e726da40a7885ec3b6fe13863c841607d463f8801670c136775a8f100ba37ab70afde47a54d83a0e42fee36a101305d6"

RPROVIDES:${PN} += "ghc-devel-psqueues-0.2.7.3-HjZq7FmM1u5AN66Kt7is6C \
ghc-psqueues-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-psqueues"

inherit rpm
