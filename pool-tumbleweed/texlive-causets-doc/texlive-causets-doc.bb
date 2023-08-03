SUMMARY = "Documentation for texlive-causets"
DESCRIPTION = "This package includes the documentation for texlive-causets"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn66359"

RPM_NAME = "texlive-causets-doc-2023.209.1.4svn66359-53.1.noarch.rpm"
RPM_HASH = "7772e25c78c5af5ae2d94d2e7b39ea9a9eb1b86c3d0270e99f87e5cf619c8fa18280a912b58fa804a8df7940c0c0ab4ff8e0c39b22d194c3b293a389ec04e62c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-causets-doc"

RDEPENDS:${PN} += ""

inherit rpm
