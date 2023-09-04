SUMMARY = "Haskell memory profiling library"
DESCRIPTION = "This package provides the Haskell memory profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-prof-0.18.0-2.9.aarch64.rpm"
RPM_HASH = "dc0f8d67f9aa6ce6fac6942996b28df0ada7a5a72d24a2d8509f6f2f0625f79f72da36628089328d5ab3c9f392b820f12c852fba7b2f484b791acfe93eba326f"

RPROVIDES:${PN} += "ghc-memory-prof \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1"

RDEPENDS:${PN} += "ghc-memory-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
