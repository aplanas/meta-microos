SUMMARY = "Haskell stm-chans profiling library"
DESCRIPTION = "This package provides the Haskell stm-chans profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-prof-3.0.0.9-1.8.aarch64.rpm"
RPM_HASH = "3a50dd8b5f9e56702d7d44b71a202f26f91e85e4bc616aee0f0fc98595c4e80d36230144f1ee9aeea499ba2003b880132899f6fecd3ee0e03cfee8ff620a7c3c"

RPROVIDES:${PN} += "ghc-prof-stm-chans-3.0.0.9-HC5DzDy937dJnRBWxlJfuc \
ghc-stm-chans-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-stm-2.5.1.0 \
ghc-stm-chans-devel"

inherit rpm
