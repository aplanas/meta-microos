SUMMARY = "Documentation for texlive-ctanify"
DESCRIPTION = "This package includes the documentation for texlive-ctanify"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.9.1svn44129"

RPM_NAME = "texlive-ctanify-doc-2023.204.1.9.1svn44129-54.1.noarch.rpm"
RPM_HASH = "ba1de67c98ddd371f89a570cd37df46ed3cd2301d2437f91a24adf8459c54d18c66592b4709cc772beea4107f1ad345023074ea4e38e0c008fd0bac1e6f50762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(ctanify.1) \
texlive-ctanify-doc"

RDEPENDS:${PN} += ""

inherit rpm
