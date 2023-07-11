SUMMARY = "Haskell stm library development files"
DESCRIPTION = "This package provides the Haskell stm library development files."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-devel-2.5.1.0-3.2.aarch64.rpm"
RPM_HASH = "246d1506c4a75737d86092ff893d5e1beb453b80ea0ac28b8e10f6d12b89b9f0b1d120d881dc6a07bc7ad29de0afb7935eb5eeb461cd5b1788a941f65fb030af"

RPROVIDES:${PN} += "ghc-devel-stm-2.5.1.0 \
ghc-stm-devel \
ghc-stm-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-stm"

inherit rpm
