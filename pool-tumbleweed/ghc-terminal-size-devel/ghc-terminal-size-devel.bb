SUMMARY = "Haskell terminal-size library development files"
DESCRIPTION = "This package provides the Haskell terminal-size library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-devel-0.3.4-1.4.aarch64.rpm"
RPM_HASH = "b68596b540a12d7c5474735f83a5f1e3883b72220c158f3c0f9b9e05bc9bfd0ca1e02327fc22f2d17ea5d2d61a875c8fab891a2a6c6941489fc2869f22e7da1d"

RPROVIDES:${PN} += "ghc-devel-terminal-size-0.3.4-3vDBLsxBXgoFiFoFBqm3N8 \
ghc-terminal-size-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-terminal-size"

inherit rpm
