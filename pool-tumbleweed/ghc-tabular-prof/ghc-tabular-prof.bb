SUMMARY = "Haskell tabular profiling library"
DESCRIPTION = "This package provides the Haskell tabular profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-prof-0.2.2.8-4.6.aarch64.rpm"
RPM_HASH = "84dd23bee9dc2f624232c7b3efdb3eabb1bc95579722969502871fff515f297c81de79c480e09b5b4512120b96c4c8a48c4f5fbda18483ebad56c9057befd638"

RPROVIDES:${PN} += "ghc-prof-tabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp \
ghc-tabular-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-csv-0.1.2-LKioaw43aTAAAKpIk04xxN \
ghc-prof-html-1.0.1.2-U7qWIp0bJwCnAFPlj3UZy \
ghc-prof-mtl-2.2.2 \
ghc-tabular-devel"

inherit rpm
