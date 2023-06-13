SUMMARY = "Documentation for texlive-proof-at-the-end"
DESCRIPTION = "This package includes the documentation for texlive-proof-at-the-end"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64188"

RPM_NAME = "texlive-proof-at-the-end-doc-2023.201.svn64188-52.1.noarch.rpm"
RPM_HASH = "e6e8dc98575937222f356af8f865e753dd1a9969b282bf02b02799da1783da1e1f017492f7de3d4fee2f788c30115efa70756793c9f19b3a1be26116174eb003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proof-at-the-end-doc"

RDEPENDS:${PN} += ""

inherit rpm
