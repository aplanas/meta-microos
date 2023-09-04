SUMMARY = "Haskell attoparsec profiling library"
DESCRIPTION = "This package provides the Haskell attoparsec profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-prof-0.14.4-4.4.aarch64.rpm"
RPM_HASH = "775d7703d8e8a459dcdf479f1a98b5b849c8b3105cee5d94a7789f797bcd1c09b113a289352ebc5c3bb613b283be8f21e7c04dec256b5bf2c35ee214968ee8e1"

RPROVIDES:${PN} += "ghc-attoparsec-prof \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3"

RDEPENDS:${PN} += "ghc-attoparsec-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
