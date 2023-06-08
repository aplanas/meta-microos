SUMMARY = "Haskell parser-combinators library development files"
DESCRIPTION = "This package provides the Haskell parser-combinators library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-devel-1.3.0-2.3.aarch64.rpm"
RPM_HASH = "840ebdfa9cd5d1434aeca20b7578e5ece3178b641130e71d74eab786ac98f8dc61ba863663a71109d87808c490dadf4cb808661163cb4eca1c58c8f5cb7bab25"

RPROVIDES:${PN} += "ghc-devel(parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt) ghc-parser-combinators-devel ghc-parser-combinators-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-parser-combinators"

inherit rpm
