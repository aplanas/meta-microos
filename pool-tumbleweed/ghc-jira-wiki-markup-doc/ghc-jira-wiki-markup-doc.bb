SUMMARY = "Haskell jira-wiki-markup library documentation"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup library documentation."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-doc-1.5.1-1.6.noarch.rpm"
RPM_HASH = "8c36937f0c89da809caf3766b383ab0711b74e35216e4909c140f5717ee40e5c0045e5fc6f13cb7449f4697e1336f4610f3b6381e032f06e8464042afae96081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-jira-wiki-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
