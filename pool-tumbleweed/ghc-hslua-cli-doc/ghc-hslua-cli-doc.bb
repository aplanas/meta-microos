SUMMARY = "Haskell hslua-cli library documentation"
DESCRIPTION = "This package provides the Haskell hslua-cli library documentation."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ghc-hslua-cli-doc-1.4.1-1.2.noarch.rpm"
RPM_HASH = "6cbf39ec5c25024882c019a007f78eb701f70e85aa81815c6a857c5796323bf727fea3f9f787000d46f854d80641241969600244cb1a7c48874557ada066cad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-cli-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
