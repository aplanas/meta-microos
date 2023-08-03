SUMMARY = "Documentation for texlive-glossaries-estonian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-estonian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-doc-2023.209.1.0svn49928-54.1.noarch.rpm"
RPM_HASH = "7f8e94304e7e24641c3f7d719c4f0bb68965d63bf3103f2f35b1b9fd7d6104c97578084d56da22a8fc6b589a5e8ff89df55e8b4694bcebc737328043cbc60ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-estonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
