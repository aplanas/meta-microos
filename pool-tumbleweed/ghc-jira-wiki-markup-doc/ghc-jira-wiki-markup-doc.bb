SUMMARY = "Haskell jira-wiki-markup library documentation"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup library documentation."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-doc-1.5.1-1.3.noarch.rpm"
RPM_HASH = "db9ae4a6b089149baedf1f846ceebad62e9cd96bf8f134ee4c26ae347481451b8235016c49da366bd26574ad2e1073ccf0f12fbf228efd0667bebacd52e3933a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-jira-wiki-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
