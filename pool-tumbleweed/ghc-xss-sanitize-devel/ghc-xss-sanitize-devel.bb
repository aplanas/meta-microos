SUMMARY = "Haskell xss-sanitize library development files"
DESCRIPTION = "This package provides the Haskell xss-sanitize library development files."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-devel-0.3.7.2-1.6.aarch64.rpm"
RPM_HASH = "2cbfda9fa90ec2d1ba2645434318e7bc2c479c187a2b2ae7ac0ed4abd659e3800058a71ff5acb568db00c9438ceb5f341cc7bf87a8ab5fd4b993f013720b1b21"

RPROVIDES:${PN} += "ghc-devel-xss-sanitize-0.3.7.2-FCgYumvpQn8Hd22tbbEcXW \
ghc-xss-sanitize-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-tagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-xss-sanitize"

inherit rpm
