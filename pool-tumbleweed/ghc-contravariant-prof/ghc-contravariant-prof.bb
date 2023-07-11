SUMMARY = "Haskell contravariant profiling library"
DESCRIPTION = "This package provides the Haskell contravariant profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-prof-1.5.5-2.6.aarch64.rpm"
RPM_HASH = "94d9e7e0631e00158bf4a12a6e41d7dc0d8dbae44ed1640d3d701895051025b3dbbd139110859c66bf820655a976d14c97f4bd6f6c29913d86d73518dcd37a3c"

RPROVIDES:${PN} += "ghc-contravariant-prof \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao"

RDEPENDS:${PN} += "ghc-contravariant-devel \
ghc-prof-StateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN \
ghc-prof-base-4.17.1.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
