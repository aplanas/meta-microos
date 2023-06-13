SUMMARY = "Documentation for texlive-tikz-cd"
DESCRIPTION = "This package includes the documentation for texlive-tikz-cd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59133"

RPM_NAME = "texlive-tikz-cd-doc-2023.201.1.0svn59133-54.1.noarch.rpm"
RPM_HASH = "1a334c70241cbe60c8a69ee585bd081b7ab57a9dddf1c31a2b42af9a5b2d2b62f1ce50309dcfc2d01a6a2bb7345c354bc7ccc85fabb200404efceb54f1bbcbcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-cd-doc"

RDEPENDS:${PN} += ""

inherit rpm
