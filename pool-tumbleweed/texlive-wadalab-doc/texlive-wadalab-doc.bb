SUMMARY = "Documentation for texlive-wadalab"
DESCRIPTION = "This package includes the documentation for texlive-wadalab"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42428"

RPM_NAME = "texlive-wadalab-doc-2023.201.svn42428-53.1.noarch.rpm"
RPM_HASH = "a7a1356c38dd1638aa6561992f308462a42b66ee1d655a001ceb9ea4dd508a7b91ca3b78c220fc70caf70bbf660a337adcc6f0f02e20b29826eb1406de9f5949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wadalab-doc"

RDEPENDS:${PN} += ""

inherit rpm
