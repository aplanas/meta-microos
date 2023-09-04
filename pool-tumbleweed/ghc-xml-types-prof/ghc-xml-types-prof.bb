SUMMARY = "Haskell xml-types profiling library"
DESCRIPTION = "This package provides the Haskell xml-types profiling library."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-prof-0.3.8-4.3.aarch64.rpm"
RPM_HASH = "a0dc4b5f4eb3a893264a5a04e2da416a4afff66457570d501eb86c9a51af668e49c6d2d1313bff24784014af123c57b2875f8e2ce4ea2bbdaa8aa7d8dd9cdbbc"

RPROVIDES:${PN} += "ghc-prof-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6 \
ghc-xml-types-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-text-2.0.2 \
ghc-xml-types-devel"

inherit rpm
