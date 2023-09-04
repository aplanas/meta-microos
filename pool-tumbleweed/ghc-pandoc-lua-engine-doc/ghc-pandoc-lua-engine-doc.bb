SUMMARY = "Haskell pandoc-lua-engine library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-doc-0.2.0.1-1.15.noarch.rpm"
RPM_HASH = "d329d1775105b355da3b14961b5b57c2b416ec1b9d1a61a9181d2b333f9f9f1499e91d76d7eae4008323e24a87eab26fde7a40c501b184a16adb9d1ca7bd7628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
