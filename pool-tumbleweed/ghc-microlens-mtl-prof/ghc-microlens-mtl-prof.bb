SUMMARY = "Haskell microlens-mtl profiling library"
DESCRIPTION = "This package provides the Haskell microlens-mtl profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.3"

RPM_NAME = "ghc-microlens-mtl-prof-0.2.0.3-2.3.aarch64.rpm"
RPM_HASH = "8500b056a63a4c780cd1730733a8982acda6dca0e44ca190e7de9b8e847a5a2ad18edbb63f56710b5faafc7d96ab207c7b0e56fd965fb1abe4557dbb7a081979"

RPROVIDES:${PN} += "ghc-microlens-mtl-prof \
ghc-prof-microlens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h"

RDEPENDS:${PN} += "ghc-microlens-mtl-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
