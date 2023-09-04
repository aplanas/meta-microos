SUMMARY = "Haskell attoparsec-iso8601 profiling library"
DESCRIPTION = "This package provides the Haskell attoparsec-iso8601 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.0"

RPM_NAME = "ghc-attoparsec-iso8601-prof-1.1.0.0-3.4.aarch64.rpm"
RPM_HASH = "971a3bf7e282162c5e30c2e652a1bc00ae6b8d5e47bbc97514ed02deb3a6453396a6ee5c192fa525afd2df855615137cae65dee6140eebb78ee1e3cd1fa19e5f"

RPROVIDES:${PN} += "ghc-attoparsec-iso8601-prof \
ghc-prof-attoparsec-iso8601-1.1.0.0-1OFsQ5gAnygIPmkbstF7Ta"

RDEPENDS:${PN} += "ghc-attoparsec-iso8601-devel \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM"

inherit rpm
