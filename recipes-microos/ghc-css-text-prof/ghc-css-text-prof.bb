SUMMARY = "Haskell css-text profiling library"
DESCRIPTION = "This package provides the Haskell css-text profiling library."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-prof-0.1.3.0-4.3.aarch64.rpm"
RPM_HASH = "3e10a6d60fc1944ca416ac78e168f9e7b2c18181fdfad741577d4f245aab19311f52b3abb40a90ac8e14dee4183db37ec5f52741ec7162fcd31de96e46603546"

RPROVIDES:${PN} += "ghc-css-text-prof ghc-css-text-prof(aarch-64) ghc-prof(css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs)"
RDEPENDS:${PN} += "ghc-css-text-devel ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) ghc-prof(base-4.17.1.0) ghc-prof(text-2.0.2)"

inherit rpm
