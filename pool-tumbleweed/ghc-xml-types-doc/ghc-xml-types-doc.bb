SUMMARY = "Haskell xml-types library documentation"
DESCRIPTION = "This package provides the Haskell xml-types library documentation."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-doc-0.3.8-4.3.noarch.rpm"
RPM_HASH = "2f12f461a14d4230cf489add63ccd5e8119158f655ae0779d97ef966aa59861c9bdee823a785fdaf52f077c98721fb153bfb89bc5c3b08f0567032e77095afc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
