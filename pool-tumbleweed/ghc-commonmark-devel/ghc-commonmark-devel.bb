SUMMARY = "Haskell commonmark library development files"
DESCRIPTION = "This package provides the Haskell commonmark library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-commonmark-devel-0.2.3-1.2.aarch64.rpm"
RPM_HASH = "e4c750641bd41b12d4dc9f7c0ea21f81ddefa7e62f59c897e35b3f906cce95df232b601fa25814d2f25d6341f753414d503ee4a2511851835838bfe3ee305e67"

RPROVIDES:${PN} += "ghc-commonmark-devel \
ghc-devel-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-devel-unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO"

inherit rpm
