SUMMARY = "Haskell jira-wiki-markup library documentation"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup library documentation."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-doc-1.5.1-1.8.noarch.rpm"
RPM_HASH = "32f873580011038356b69e28b7d719c9de1ad5152270879b5965f593ef620f406a51f6b40403f30d76c1298bce71c5d6bc5bd2ddb26e9af3d52e6166f3522ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-jira-wiki-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
