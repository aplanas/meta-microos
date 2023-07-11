SUMMARY = "Haskell attoparsec profiling library"
DESCRIPTION = "This package provides the Haskell attoparsec profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-prof-0.14.4-3.6.aarch64.rpm"
RPM_HASH = "03482c7f181647c4c5ecafcfbc2f8c8f92f89388820f53f7c71778971a60571b008606b7c8b198623526f259f370bf68702f137bcd8be9c45595749b5973f5e3"

RPROVIDES:${PN} += "ghc-attoparsec-prof \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3"

RDEPENDS:${PN} += "ghc-attoparsec-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
