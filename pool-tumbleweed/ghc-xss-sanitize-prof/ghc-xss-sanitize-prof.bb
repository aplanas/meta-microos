SUMMARY = "Haskell xss-sanitize profiling library"
DESCRIPTION = "This package provides the Haskell xss-sanitize profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-prof-0.3.7.2-1.6.aarch64.rpm"
RPM_HASH = "ee9a2ed20848eb157123efad5d8190c7ea1a554d8a3551bd00c6e6eaa289c3a846d2c515724da2a6b5e8589dbe80c01c1649dd749db7dfdf098051ffc9be40bc"

RPROVIDES:${PN} += "ghc-prof-xss-sanitize-0.3.7.2-FCgYumvpQn8Hd22tbbEcXW \
ghc-xss-sanitize-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-tagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-xss-sanitize-devel"

inherit rpm
