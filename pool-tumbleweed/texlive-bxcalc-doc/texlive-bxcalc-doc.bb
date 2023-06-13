SUMMARY = "Documentation for texlive-bxcalc"
DESCRIPTION = "This package includes the documentation for texlive-bxcalc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56431"

RPM_NAME = "texlive-bxcalc-doc-2023.201.1.1svn56431-52.1.noarch.rpm"
RPM_HASH = "72c27a1d5dbe91d659db88ffa6b65ffd1f658cdcd581c5b6c673c1734b18a734a9f135aae69f6037dfe17e26264452d204900a5cf6a061c345427faa516a3f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
