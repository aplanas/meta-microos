SUMMARY = "Haskell tabular library development files"
DESCRIPTION = "This package provides the Haskell tabular library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-devel-0.2.2.8-4.3.aarch64.rpm"
RPM_HASH = "80aaaf0ddfd592b0bf569abdbbdbcd514c9b7cad8a213e024b025668b27b4a41253005e097494f89b61b9bbb31823de444decac3dce614290035f955eebe2514"

RPROVIDES:${PN} += "ghc-devel(tabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp) ghc-tabular-devel ghc-tabular-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(csv-0.1.2-LKioaw43aTAAAKpIk04xxN) ghc-devel(html-1.0.1.2-U7qWIp0bJwCnAFPlj3UZy) ghc-devel(mtl-2.2.2) ghc-tabular"

inherit rpm
