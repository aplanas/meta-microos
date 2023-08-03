SUMMARY = "Documentation for texlive-tkz-graph"
DESCRIPTION = "This package includes the documentation for texlive-tkz-graph"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn57484"

RPM_NAME = "texlive-tkz-graph-doc-2023.209.2.0svn57484-53.1.noarch.rpm"
RPM_HASH = "59ad35f4c4ef828f189903915758d06178a372c4ed47932f2910e19767fc1789dac211785bdb501e0c0380010979190d1e694f2d9cca56c7ec56a033438a779b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-graph-doc-fr \
texlive-tkz-graph-doc"

RDEPENDS:${PN} += ""

inherit rpm
