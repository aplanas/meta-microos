SUMMARY = "Haskell cairo profiling library"
DESCRIPTION = "This package provides the Haskell cairo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.10.0"

RPM_NAME = "ghc-cairo-prof-0.13.10.0-1.3.aarch64.rpm"
RPM_HASH = "cffc1a68e0fd178f250b38a8a4e6e56f0df533af316ce99cc3b3a2151c16ee164b9a0773ad368d09b112db82383dff54031c14438d68c0ee37aab287e2341beb"

RPROVIDES:${PN} += "ghc-cairo-prof \
ghc-prof-cairo-0.13.10.0-79KHEyza8Yx2ITjvRp5k2b"

RDEPENDS:${PN} += "ghc-cairo-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q"

inherit rpm
