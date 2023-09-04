SUMMARY = "Haskell mmorph library development files"
DESCRIPTION = "This package provides the Haskell mmorph library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "ghc-mmorph-devel-1.2.0-4.3.aarch64.rpm"
RPM_HASH = "348290ccf8ddcd637fe5ac86fc86694d032549e054ac590e52e3fd2f88b2cea27b3eb8d1c1734274a3fd27fae0bf851324f13b9121e3c9081760a85d7d923a25"

RPROVIDES:${PN} += "ghc-devel-mmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn \
ghc-mmorph-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-mmorph"

inherit rpm
