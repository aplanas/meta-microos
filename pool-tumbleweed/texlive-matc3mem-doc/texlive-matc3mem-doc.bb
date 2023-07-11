SUMMARY = "Documentation for texlive-matc3mem"
DESCRIPTION = "This package includes the documentation for texlive-matc3mem"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn35773"

RPM_NAME = "texlive-matc3mem-doc-2023.208.1.1svn35773-53.1.noarch.rpm"
RPM_HASH = "9e9df4df3a0c89d1e19b0fecd8a7dce19fa9aeda45df4505e797782eed2c45eb382744c585dca04659e06f63dee5923d3b23e3961cd1d5b24e8b932da78397c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-matc3mem-doc-it \
texlive-matc3mem-doc"

RDEPENDS:${PN} += ""

inherit rpm
