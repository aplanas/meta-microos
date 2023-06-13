SUMMARY = "Documentation for texlive-font-change"
DESCRIPTION = "This package includes the documentation for texlive-font-change"
LICENSE = "LPPL-1.0"

PV = "2023.201.2015.2svn40403"

RPM_NAME = "texlive-font-change-doc-2023.201.2015.2svn40403-52.1.noarch.rpm"
RPM_HASH = "54f27f46700b260bb4f78192120e1093c3480bff7acac97e1af120ff576a898bd26ecfae51c599f7cca2f8806ce8d2db5ab03cce1a26935702162f2468f5e72c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-font-change-doc"

RDEPENDS:${PN} += ""

inherit rpm
