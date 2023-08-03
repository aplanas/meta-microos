SUMMARY = "Documentation for texlive-uni-wtal-ger"
DESCRIPTION = "This package includes the documentation for texlive-uni-wtal-ger"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn31541"

RPM_NAME = "texlive-uni-wtal-ger-doc-2023.209.0.0.2svn31541-54.1.noarch.rpm"
RPM_HASH = "7d4d0312fc9082cb1d7fa6f0c978fbe4cd6fd67068c886246167ba87f56b004bdf7f9848db82b807f906b3964a6402b5b10d30788461ccea82d1ccc960a6bc0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uni-wtal-ger-doc-de;en \
texlive-uni-wtal-ger-doc"

RDEPENDS:${PN} += ""

inherit rpm
