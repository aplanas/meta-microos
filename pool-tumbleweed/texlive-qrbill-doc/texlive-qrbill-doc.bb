SUMMARY = "Documentation for texlive-qrbill"
DESCRIPTION = "This package includes the documentation for texlive-qrbill"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn66301"

RPM_NAME = "texlive-qrbill-doc-2023.209.2.00svn66301-54.2.noarch.rpm"
RPM_HASH = "ab3fd0eaab8012e2f9eba89871f73b848263c27ff8e79d6f32ce193e302907e3b959348e0d8a178ce16814fe381391a2bd1bb4a04137565838100a1c0a389695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrbill-doc"

RDEPENDS:${PN} += ""

inherit rpm
