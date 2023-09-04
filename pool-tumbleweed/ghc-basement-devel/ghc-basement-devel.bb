SUMMARY = "Haskell basement library development files"
DESCRIPTION = "This package provides the Haskell basement library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-devel-0.0.16-1.5.aarch64.rpm"
RPM_HASH = "bd580d6264d19390ce84d4cf8a0915c3667635b5ce5639659eb8d3d09f910794f679c9c1fa992451336ee15c7d4d78e6a6f0a2f9c4e1601c7b3dee25fb35fefc"

RPROVIDES:${PN} += "ghc-basement-devel \
ghc-devel-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-basement \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-prim-0.9.1"

inherit rpm
