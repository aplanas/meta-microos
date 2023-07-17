SUMMARY = "Haskell texmath library documentation"
DESCRIPTION = "This package provides the Haskell texmath library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-doc-0.12.8-1.3.noarch.rpm"
RPM_HASH = "4f19fad9b2a6324d7564f4ef232ef28d926cce6bc57f18874516b5a64337281d0aad6459c3e8cfd5e49f3919d6e56c44438d76546a356fa864c6584dc0b83ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-texmath-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
