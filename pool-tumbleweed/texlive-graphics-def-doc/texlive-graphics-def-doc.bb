SUMMARY = "Documentation for texlive-graphics-def"
DESCRIPTION = "This package includes the documentation for texlive-graphics-def"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64487"

RPM_NAME = "texlive-graphics-def-doc-2023.201.svn64487-53.1.noarch.rpm"
RPM_HASH = "bf04983e8f43b79d74c7fae2e072a07003de900f704be6449ed6bbd7b9d93d85088bb6d4f01efb2032eb1a506ca9778d8580550fe061781b512347f121a9ae85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-def-doc"
RDEPENDS:${PN} += ""

inherit rpm
