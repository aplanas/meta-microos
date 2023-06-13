SUMMARY = "Documentation for texlive-context-mathsets"
DESCRIPTION = "This package includes the documentation for texlive-context-mathsets"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-mathsets-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "d9a0b570377eb657d85033904d19558e9bbf6b1a3b1641b49b20a2217888845886f11184de621dd47390ea189ed21cd92219be33f3076df6c356b8e2c2022eb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-mathsets-doc"

RDEPENDS:${PN} += ""

inherit rpm
