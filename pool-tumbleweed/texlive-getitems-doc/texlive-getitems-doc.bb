SUMMARY = "Documentation for texlive-getitems"
DESCRIPTION = "This package includes the documentation for texlive-getitems"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39365"

RPM_NAME = "texlive-getitems-doc-2023.209.1.0svn39365-53.1.noarch.rpm"
RPM_HASH = "804fada2f13d8d06f4195fc10668b231b37a6191df1d5179cc013c6dffd0a6c0841d319e93f98ad1abe0830982fce9c430be6be69646154179e993ee0d3331dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getitems-doc"

RDEPENDS:${PN} += ""

inherit rpm
