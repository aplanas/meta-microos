SUMMARY = "Haskell ghc-compact library development files"
DESCRIPTION = "This package provides the Haskell ghc-compact library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-devel-0.1.0.0-1.1.aarch64.rpm"
RPM_HASH = "c81ede2708cb7630fe68ea7d9f9948985f39366dbab31874a18a4f7116f919602fda9823d8d80938493d50065a49a8187eafb0b59ced2bc31fce5bbf55ab40a9"

RPROVIDES:${PN} += "ghc-devel-ghc-compact-0.1.0.0 \
ghc-ghc-compact-devel \
ghc-ghc-compact-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-ghc-prim-0.9.1 \
ghc-ghc-compact"

inherit rpm
