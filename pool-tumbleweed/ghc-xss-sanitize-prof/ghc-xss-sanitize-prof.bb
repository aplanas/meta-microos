SUMMARY = "Haskell xss-sanitize profiling library"
DESCRIPTION = "This package provides the Haskell xss-sanitize profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-prof-0.3.7.2-1.3.aarch64.rpm"
RPM_HASH = "f505c137ea7610d13fe890badc64a69f4bf7c802b72799e75249a5c61ed700596c88989e032072d99667ae783d4859647ce6df7d6ba65c11dfd6949461a3fc0c"

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
