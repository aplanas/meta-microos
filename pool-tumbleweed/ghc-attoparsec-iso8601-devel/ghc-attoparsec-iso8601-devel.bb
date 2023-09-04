SUMMARY = "Haskell attoparsec-iso8601 library development files"
DESCRIPTION = "This package provides the Haskell attoparsec-iso8601 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.0"

RPM_NAME = "ghc-attoparsec-iso8601-devel-1.1.0.0-3.4.aarch64.rpm"
RPM_HASH = "2b29d84ab0c29d298f33b8e9626a825667e9033dcac3a1b45266577ae505a7202edff48787396b715bd11e27ef6c909804c7b4bb0ec342f8025f9092ecba889e"

RPROVIDES:${PN} += "ghc-attoparsec-iso8601-devel \
ghc-devel-attoparsec-iso8601-1.1.0.0-1OFsQ5gAnygIPmkbstF7Ta"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-attoparsec-iso8601 \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM"

inherit rpm
