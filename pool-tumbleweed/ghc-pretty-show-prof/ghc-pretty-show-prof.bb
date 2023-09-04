SUMMARY = "Haskell pretty-show profiling library"
DESCRIPTION = "This package provides the Haskell pretty-show profiling library."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-prof-1.10-4.8.aarch64.rpm"
RPM_HASH = "b49f5d297b67d012a386237ea958b7d90b2f38d1e154239fa03b6d2508430006371ead31ffa774bad928b329375e594d63ab702f4a2bc230320674a30073ecd7"

RPROVIDES:${PN} += "ghc-pretty-show-prof \
ghc-prof-pretty-show-1.10-FKBNqO5OmUpJSHpBLbk95K"

RDEPENDS:${PN} += "ghc-pretty-show-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-haskell-lexer-1.1.1-C14Cmw3wUWQ88vb32sfZ2Z \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-text-2.0.2"

inherit rpm
