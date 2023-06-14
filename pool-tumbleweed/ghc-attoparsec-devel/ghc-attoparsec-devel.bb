SUMMARY = "Haskell attoparsec library development files"
DESCRIPTION = "This package provides the Haskell attoparsec library development files."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-devel-0.14.4-3.3.aarch64.rpm"
RPM_HASH = "6b88e3d14a1d68b20c7925d575da85a8065cd23a2b457ff847c869ac1fcfd68c5f60c5dde0a1ac34bea69b2858185b8f0ce43785345a0e320cb40ff8ba2c47ac"

RPROVIDES:${PN} += "ghc-attoparsec-devel \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3"

RDEPENDS:${PN} += "/bin/sh \
ghc-attoparsec \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
