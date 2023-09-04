SUMMARY = "Haskell resourcet library development files"
DESCRIPTION = "This package provides the Haskell resourcet library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-devel-1.2.6-2.8.aarch64.rpm"
RPM_HASH = "6ab78e9597a0cf9f202e082b9d06624010a5351c7c2620b921f571161c6ced0efead1a408599eff487d4446cc560ad231eff052e5301336eaedaf27cbf2bc09f"

RPROVIDES:${PN} += "ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-resourcet-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-mtl-2.2.2 \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-resourcet"

inherit rpm
