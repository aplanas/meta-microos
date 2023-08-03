SUMMARY = "Documentation for texlive-typeface"
DESCRIPTION = "This package includes the documentation for texlive-typeface"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn27046"

RPM_NAME = "texlive-typeface-doc-2023.209.0.0.1svn27046-53.1.noarch.rpm"
RPM_HASH = "8bf5e7fbf848f12dafd269893b084bdd771c607f3af6a06d6918538aee090bb25813c76b16ae6694b0bbcd78f71087059e6cc1ff1e49a5c7dafde22a67d5d0eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typeface-doc"

RDEPENDS:${PN} += ""

inherit rpm
