SUMMARY = "Documentation for texlive-qrbill"
DESCRIPTION = "This package includes the documentation for texlive-qrbill"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn66301"

RPM_NAME = "texlive-qrbill-doc-2023.209.2.00svn66301-54.1.noarch.rpm"
RPM_HASH = "61ad0a33f7d5a3b7d000120e4e24f75f0e55a56ce68cc39af0cfbecfeac1e044a8398a94fe28aca99351fafb2be630f0639e8b66cf347097c0145664864a84f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrbill-doc"

RDEPENDS:${PN} += ""

inherit rpm
