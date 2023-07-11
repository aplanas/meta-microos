SUMMARY = "Haskell css-text library development files"
DESCRIPTION = "This package provides the Haskell css-text library development files."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-devel-0.1.3.0-4.6.aarch64.rpm"
RPM_HASH = "354536b8aba4ba57d90a0ddcb25c4d9ec7128be828974e4b6add8ad861a07163958caf82852bc3b5e0b45b632642d1ac0402a14e7402be18c5dd511dfeaadf13"

RPROVIDES:${PN} += "ghc-css-text-devel \
ghc-devel-css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-css-text \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-text-2.0.2"

inherit rpm
