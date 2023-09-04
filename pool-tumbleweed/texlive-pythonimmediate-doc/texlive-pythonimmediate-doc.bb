SUMMARY = "Documentation for texlive-pythonimmediate"
DESCRIPTION = "This package includes the documentation for texlive-pythonimmediate"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn66461"

RPM_NAME = "texlive-pythonimmediate-doc-2023.209.0.0.4.0svn66461-54.2.noarch.rpm"
RPM_HASH = "a188824ed2c55ab019c4c9a847a2f6d303b665cfff9d3988300b0277a297be507e40c1ef803a110ce8a3d3f7cfcd1b3ac5995b011fa4b436d3f7856dcc917396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonimmediate-doc"

RDEPENDS:${PN} += ""

inherit rpm
