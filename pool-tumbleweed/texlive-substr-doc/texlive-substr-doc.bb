SUMMARY = "Documentation for texlive-substr"
DESCRIPTION = "This package includes the documentation for texlive-substr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn16117"

RPM_NAME = "texlive-substr-doc-2023.209.1.2svn16117-58.1.noarch.rpm"
RPM_HASH = "92f2dc114459d318b023af1c4322690dc970141cffeefabb6eb7660f1169681a6524aa174d6aab303d13bf28138921ada995ffb0aab5a54c6da33694b0b72048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-substr-doc"

RDEPENDS:${PN} += ""

inherit rpm
