SUMMARY = "Haskell colour profiling library"
DESCRIPTION = "This package provides the Haskell colour profiling library."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-prof-2.3.6-2.3.aarch64.rpm"
RPM_HASH = "6af7ede9909d19956d929d8c95861824484c0fa8510a918c8ddd91e65c57e9dbd36f68f5c6f827481cf93804424bd0feb7c0744ade73b13003c71b7af4a33264"

RPROVIDES:${PN} += "ghc-colour-prof \
ghc-colour-prof(aarch-64) \
ghc-prof(colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln)"

RDEPENDS:${PN} += "ghc-colour-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
