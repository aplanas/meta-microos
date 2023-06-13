SUMMARY = "Documentation for texlive-reotex"
DESCRIPTION = "This package includes the documentation for texlive-reotex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34924"

RPM_NAME = "texlive-reotex-doc-2023.201.1.1svn34924-53.1.noarch.rpm"
RPM_HASH = "b8c38953d13240f197e3bbe6a29541d4e7a3113346f237dda287fea8be4a00e7e2fcc593f0e3a1f54802824c1a4564db5423ff0a7703b81971824bc93c27ee62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
