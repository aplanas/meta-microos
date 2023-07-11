SUMMARY = "Haskell texmath library documentation"
DESCRIPTION = "This package provides the Haskell texmath library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-doc-0.12.8-1.2.noarch.rpm"
RPM_HASH = "ef5a56c09efd5ca5ce8c317b2307827428de73ca56306924f1fe6fd6cf7d823d1037f0e0a8c473b0cb3c51b78d773669d037b9207f2607f33d9cf4d330788437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-texmath-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
