SUMMARY = "Haskell commonmark-extensions library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-commonmark-extensions-doc-0.2.3.5-1.4.noarch.rpm"
RPM_HASH = "94ff023654178ce4ca2216d594a279b1c76c7ebbccdac609e7ab648de6831cfecc9326754b57b021b3e0b1ecd4d8231b4f3fe396ad08dbf186ee9c949b2be648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-extensions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
