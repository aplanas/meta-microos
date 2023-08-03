SUMMARY = "Documentation for texlive-numberedblock"
DESCRIPTION = "This package includes the documentation for texlive-numberedblock"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn33109"

RPM_NAME = "texlive-numberedblock-doc-2023.209.1.10svn33109-55.1.noarch.rpm"
RPM_HASH = "e4d7739b8d05c72dfaddbfbdc6a99ede5a80eb9569393a2c55dce714eab3c56a0ce796f2c89dba73ecad325044fdbd345cf2fe9ad45e68ad85d4208a421db6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numberedblock-doc"

RDEPENDS:${PN} += ""

inherit rpm
