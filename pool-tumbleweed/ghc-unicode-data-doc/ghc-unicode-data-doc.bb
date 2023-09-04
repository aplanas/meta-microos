SUMMARY = "Haskell unicode-data library documentation"
DESCRIPTION = "This package provides the Haskell unicode-data library documentation."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-doc-0.4.0.1-3.8.noarch.rpm"
RPM_HASH = "203c6d7f79998061811a4b24464467d8d69da2abdc52e31eea786df551f2e1c6b62f8bc8d8733bf384eb18eab4bbde4c00b352c1bb29e1fb6c21e47504021aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-data-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
