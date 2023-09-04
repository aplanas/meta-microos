SUMMARY = "Haskell postgresql-simple profiling library"
DESCRIPTION = "This package provides the Haskell postgresql-simple profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.5.1"

RPM_NAME = "ghc-postgresql-simple-prof-0.6.5.1-1.4.aarch64.rpm"
RPM_HASH = "6d66f5b5149e53bc38fd30b0d087dad513425870e8dc970827d48770f98378816f795d5ec4bcccce5c86ca7902ac2ad642270a3b5a1f32d10d2ebfddd5fa6d8a"

RPROVIDES:${PN} += "ghc-postgresql-simple-prof \
ghc-prof-postgresql-simple-0.6.5.1-1VNm6CFaKplLWGwA33lD3u"

RDEPENDS:${PN} += "ghc-postgresql-simple-devel \
ghc-prof-Only-0.1-qCrN026ulaL2ZFxnlcrV1 \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-postgresql-libpq-0.9.5.0-LAEYJt6pIENHmjvWelVvQG \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
