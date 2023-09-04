SUMMARY = "Documentation for texlive-quran-de"
DESCRIPTION = "This package includes the documentation for texlive-quran-de"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn54191"

RPM_NAME = "texlive-quran-de-doc-2023.209.0.0.2svn54191-54.2.noarch.rpm"
RPM_HASH = "0cb38731bc28cd8825e786cddcd8374bda1be788cd99d6bd39515efa6be3edcc58acfdc53e58d61fc0524e036d9a624514efcb79cb1e96b493ac2f619ba7a728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-de-doc"

RDEPENDS:${PN} += ""

inherit rpm
