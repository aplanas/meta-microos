SUMMARY = "Haskell OneTuple profiling library"
DESCRIPTION = "This package provides the Haskell OneTuple profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-OneTuple-prof-0.4.1.1-1.4.aarch64.rpm"
RPM_HASH = "736a48886f8f1dc4b65ac1762becec1f27c02aeb1ab98fd5e56f17290c8b9d16509ba10b311d5a2373813b27a1a9ccb3ef60cb9ec04f491be5f2631b163e0bfc"

RPROVIDES:${PN} += "ghc-OneTuple-prof \
ghc-prof-OneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI"

RDEPENDS:${PN} += "ghc-OneTuple-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
