SUMMARY = "Documentation for texlive-poetry"
DESCRIPTION = "This package includes the documentation for texlive-poetry"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn53129"

RPM_NAME = "texlive-poetry-doc-2023.209.2.2svn53129-53.1.noarch.rpm"
RPM_HASH = "0351c84206719e5afead779401cd96fbae5fa3874ded7d92f7c05bd0288309d2b300d918d4450cbae5ffb60407dc15e81d7013b631c56fffc5794b2b0f922f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poetry-doc"

RDEPENDS:${PN} += ""

inherit rpm
