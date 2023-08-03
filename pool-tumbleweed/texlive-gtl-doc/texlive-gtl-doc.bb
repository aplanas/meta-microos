SUMMARY = "Documentation for texlive-gtl"
DESCRIPTION = "This package includes the documentation for texlive-gtl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn49527"

RPM_NAME = "texlive-gtl-doc-2023.209.0.0.5svn49527-54.1.noarch.rpm"
RPM_HASH = "349e8a1806b903ad601a2715519a2244d1566eb84b394fa016ab13fa79d3113e8e72ff494211d0192ced848177302964198c9e139122949b85ff28e20a1ad21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtl-doc"

RDEPENDS:${PN} += ""

inherit rpm
