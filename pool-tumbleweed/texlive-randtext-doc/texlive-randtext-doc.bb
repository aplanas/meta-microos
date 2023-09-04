SUMMARY = "Documentation for texlive-randtext"
DESCRIPTION = "This package includes the documentation for texlive-randtext"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-randtext-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "355fb9014d92999eaa9420fdfa155aeab60c0b1a053af0c09f3b066b499cac707497f8d22f99e49aa2cb24aff404bac541b96cd0db895b6ecf4dc6258df2cf89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
