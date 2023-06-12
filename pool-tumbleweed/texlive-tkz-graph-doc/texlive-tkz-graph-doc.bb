SUMMARY = "Documentation for texlive-tkz-graph"
DESCRIPTION = "This package includes the documentation for texlive-tkz-graph"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn57484"

RPM_NAME = "texlive-tkz-graph-doc-2023.201.2.0svn57484-52.1.noarch.rpm"
RPM_HASH = "745980649b9bf5a2249e849d32cc57c58adaa28d077090424991c0328f540e1f2c59ccae84ab0d304c2cdea457104588d6a440a2b71b161476a39404701b83d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tkz-graph-doc:fr) \
texlive-tkz-graph-doc"
RDEPENDS:${PN} += ""

inherit rpm
