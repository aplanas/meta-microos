SUMMARY = "Documentation for texlive-tkz-berge"
DESCRIPTION = "This package includes the documentation for texlive-tkz-berge"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn57485"

RPM_NAME = "texlive-tkz-berge-doc-2023.201.2.0svn57485-52.1.noarch.rpm"
RPM_HASH = "9b728a81d0a6585d3c3b507672ba9e69be8fcfca09e82bf5847368ced8524eb085bca9b15fca41df23e6ff59e9c0042be85c0152fa96ff3551d21eb76cad1f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-berge-doc"

RDEPENDS:${PN} += ""

inherit rpm
