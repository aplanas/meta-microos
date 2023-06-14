SUMMARY = "Haskell microlens-mtl library development files"
DESCRIPTION = "This package provides the Haskell microlens-mtl library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.3"

RPM_NAME = "ghc-microlens-mtl-devel-0.2.0.3-2.2.aarch64.rpm"
RPM_HASH = "71e6a0b298bc00337ce2dd15b77f229f8b4d2e9c5daa288ef385f41fd6f2fb21c51ab022a3c3eb3676b4edbd32ca7f985afa8e68ea14f533a26fb3c587864593"

RPROVIDES:${PN} += "ghc-devel-microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV \
ghc-microlens-mtl-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-microlens-mtl"

inherit rpm
