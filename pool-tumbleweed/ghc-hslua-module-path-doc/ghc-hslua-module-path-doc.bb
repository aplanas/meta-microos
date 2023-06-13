SUMMARY = "Haskell hslua-module-path library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-path library documentation."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-path-doc-1.1.0-1.2.noarch.rpm"
RPM_HASH = "b205f68129d5eabcce7ec8598555732902dadedc008c89f2728509bcae87cd837872714575bd4bf45a1413488d4d1e19404852d2ebd92cd7adb896a4a6e53e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-path-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
