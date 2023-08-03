SUMMARY = "Documentation for texlive-polynomial"
DESCRIPTION = "This package includes the documentation for texlive-polynomial"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-polynomial-doc-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "5c400816e408225d82da8dd7d7a148857d18ceb86aedea8766add4048e7d6961f35ed7b810331566719ac60d8f8889d10f2a133a9aff1592ad9bb0e9cd8115a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polynomial-doc"

RDEPENDS:${PN} += ""

inherit rpm
