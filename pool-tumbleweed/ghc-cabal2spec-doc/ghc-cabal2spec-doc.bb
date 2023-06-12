SUMMARY = "Haskell cabal2spec library documentation"
DESCRIPTION = "This package provides the Haskell cabal2spec library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-doc-2.7.0-1.2.noarch.rpm"
RPM_HASH = "e836d6c60f0a08537ae6e642afb24fe266ddbf4239068f7f5d8d70fed08cb1736464101b2d73b8b8ef0f7ea2a8e38a0cb0d18d79049eebdfbeb82c1727bdb6fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal2spec-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
