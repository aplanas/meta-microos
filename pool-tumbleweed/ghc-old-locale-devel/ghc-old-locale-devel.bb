SUMMARY = "Haskell old-locale library development files"
DESCRIPTION = "This package provides the Haskell old-locale library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-devel-1.0.0.7-13.2.aarch64.rpm"
RPM_HASH = "1eddddc0a75a4d7abd1d1eb41fa7f34a4d28b75ecbf5c002ba6c0d5ff21fd26652453ea6f3ea075fe1f4a1fc9d1329c2b1e3e2fc35b7fb5d40bab0bbf537d3a1"

RPROVIDES:${PN} += "ghc-devel(old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR) \
ghc-old-locale-devel \
ghc-old-locale-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-old-locale"

inherit rpm
