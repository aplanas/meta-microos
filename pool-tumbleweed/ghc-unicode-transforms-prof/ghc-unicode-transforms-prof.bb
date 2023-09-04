SUMMARY = "Haskell unicode-transforms profiling library"
DESCRIPTION = "This package provides the Haskell unicode-transforms profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-prof-0.4.0.1-4.8.aarch64.rpm"
RPM_HASH = "7f5ec0688f88a32e83499640aaa6df4fe42e1456432b305ef97d46e3945907ce556e24f42e38bc8b0c279ab9b957aae5b5becab6d2cf3b980ba2fcc899424cce"

RPROVIDES:${PN} += "ghc-prof-unicode-transforms-0.4.0.1-64QTLPchVoAx7KWqlUk24 \
ghc-unicode-transforms-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-text-2.0.2 \
ghc-prof-unicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr \
ghc-unicode-transforms-devel"

inherit rpm
