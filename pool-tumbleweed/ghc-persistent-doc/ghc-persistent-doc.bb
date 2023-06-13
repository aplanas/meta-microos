SUMMARY = "Haskell persistent library documentation"
DESCRIPTION = "This package provides the Haskell persistent library documentation."
LICENSE = "MIT"

PV = "2.14.5.0"

RPM_NAME = "ghc-persistent-doc-2.14.5.0-1.4.noarch.rpm"
RPM_HASH = "7dc751023fd58fe79725e5c6d4b4feae6dd227c94a32d956cd080af3c402b576aaf1196bfd71b24f0352d44efedb9ed80b1b95e3a9f6a2b746df0a2f12941d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
