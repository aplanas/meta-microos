SUMMARY = "Haskell haddock-library library development files"
DESCRIPTION = "This package provides the Haskell haddock-library library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-devel-1.11.0-2.8.aarch64.rpm"
RPM_HASH = "b1f88afb361ac4232acb9a6cdb24e9a8f96375c14be746600042a07c2f30a4e660d70c36f89d0e32582c039ae683d4e3acc0c7b8108548d9b52098dbc6023bd6"

RPROVIDES:${PN} += "ghc-devel-haddock-library-1.11.0-GgwR20uLBzH14FvpuxBHjp \
ghc-haddock-library-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-haddock-library"

inherit rpm
