SUMMARY = "Haskell stm-chans library development files"
DESCRIPTION = "This package provides the Haskell stm-chans library development files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-devel-3.0.0.9-1.8.aarch64.rpm"
RPM_HASH = "afb40e7ccaa4741ba30fd9c6551f93bacc26b9e1dacb6c106c203a2f064d029fd239a42c0d3d33368041a0e527dc9e6ee422bce888ce06cab039775e43686b21"

RPROVIDES:${PN} += "ghc-devel-stm-chans-3.0.0.9-HC5DzDy937dJnRBWxlJfuc \
ghc-stm-chans-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-stm-2.5.1.0 \
ghc-stm-chans"

inherit rpm
