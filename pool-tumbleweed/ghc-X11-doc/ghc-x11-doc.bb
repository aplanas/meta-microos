SUMMARY = "Haskell X11 library documentation"
DESCRIPTION = "This package provides the Haskell X11 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-doc-1.10.3-2.3.noarch.rpm"
RPM_HASH = "00f4af6fca5043fae847c9b1880add7b60253e6dd00e59d83c4818dc48fefdb68008f684a31640524cd688c4d8fcc7c04fb5711caae11c23389dad2d4d78e206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-X11-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
