SUMMARY = "Haskell css-text library development files"
DESCRIPTION = "This package provides the Haskell css-text library development files."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-devel-0.1.3.0-4.3.aarch64.rpm"
RPM_HASH = "ccfab95e355b21776f46ed61937c34551da5628396cc8fe0540e2a6b6084088ba6c7f772bf9b9627c3f1b4c258ae4d384eb7b48d0b2099ac7d261613cd4c660e"

RPROVIDES:${PN} += "ghc-css-text-devel \
ghc-css-text-devel(aarch-64) \
ghc-devel(css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-css-text \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(text-2.0.2)"

inherit rpm
