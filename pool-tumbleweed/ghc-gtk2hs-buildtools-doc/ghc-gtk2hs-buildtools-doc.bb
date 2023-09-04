SUMMARY = "Haskell gtk2hs-buildtools library documentation"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools library documentation."
LICENSE = "GPL-2.0-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-gtk2hs-buildtools-doc-0.13.10.0-1.6.noarch.rpm"
RPM_HASH = "ff2bb1293b8119d7a0195146ab60416a04acf1cd087e8b1df32a0c7858ac6d1eb8e037d2679ea50d9c6280dd3ce6ac4370db33d0a7d0e04f0c28a1a5379709d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gtk2hs-buildtools-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
