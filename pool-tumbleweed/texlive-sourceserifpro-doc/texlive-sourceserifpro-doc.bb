SUMMARY = "Documentation for texlive-sourceserifpro"
DESCRIPTION = "This package includes the documentation for texlive-sourceserifpro"
LICENSE = "OFL-1.1"

PV = "2023.201.1.4svn54512"

RPM_NAME = "texlive-sourceserifpro-doc-2023.201.1.4svn54512-57.1.noarch.rpm"
RPM_HASH = "9ef490196c840c6076dc6707f21877ca2e7dca7decf56da9741c0cb0f66073b0fcc13ae18eaf34a1dcde88995d3bbe92deebdfc79470628436e79680850b1576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sourceserifpro-doc"
RDEPENDS:${PN} += ""

inherit rpm
