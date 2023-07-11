SUMMARY = "Haskell css-text profiling library"
DESCRIPTION = "This package provides the Haskell css-text profiling library."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-prof-0.1.3.0-4.6.aarch64.rpm"
RPM_HASH = "eebd5eda2b304deb2178aa282cd9e167157e6c81dbb1da1f0df256bbbc81abe3a6712d0166af9d594e5dc5c2f1e082dc288c5d5c2fdcc9c46d8403cc72793649"

RPROVIDES:${PN} += "ghc-css-text-prof \
ghc-prof-css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs"

RDEPENDS:${PN} += "ghc-css-text-devel \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-text-2.0.2"

inherit rpm
