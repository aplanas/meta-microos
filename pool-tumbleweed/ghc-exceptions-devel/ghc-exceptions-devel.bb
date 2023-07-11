SUMMARY = "Haskell exceptions library development files"
DESCRIPTION = "This package provides the Haskell exceptions library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-devel-0.10.5-3.2.aarch64.rpm"
RPM_HASH = "d53a76fb1043835ea4e28852166231e6971d3f8d383deb944fead9a9e0d81de9625c0e9cad92fe6132f6e1ea85ff4a6189c07d221618323b977c6c48de838f72"

RPROVIDES:${PN} += "ghc-devel-exceptions-0.10.5 \
ghc-exceptions-devel \
ghc-exceptions-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-exceptions"

inherit rpm
