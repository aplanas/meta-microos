SUMMARY = "Haskell microlens-mtl library development files"
DESCRIPTION = "This package provides the Haskell microlens-mtl library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.3"

RPM_NAME = "ghc-microlens-mtl-devel-0.2.0.3-2.3.aarch64.rpm"
RPM_HASH = "ec81cefc1b9cb4699759d3ec6dffeb21d80b083f3545d0543d51cdbfa7c40d370c5ad61dacc664b2ed8602e6bb80b53bb81638d0b833012ac22a65d831495f89"

RPROVIDES:${PN} += "ghc-devel-microlens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h \
ghc-microlens-mtl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-microlens-mtl"

inherit rpm
