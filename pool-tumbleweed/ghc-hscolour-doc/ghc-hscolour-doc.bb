SUMMARY = "Haskell hscolour library documentation"
DESCRIPTION = "This package provides the Haskell hscolour library documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-doc-1.24.4-4.3.noarch.rpm"
RPM_HASH = "ac8b8d239dd195bfa4104638008e7d97a2e9b400f95efe0aea91f67f85e92b33ec569484f36cd296e1a5414816ab548cea3100c4186831db239d520da14dd3c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hscolour-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
