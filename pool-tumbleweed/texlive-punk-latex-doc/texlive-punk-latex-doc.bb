SUMMARY = "Documentation for texlive-punk-latex"
DESCRIPTION = "This package includes the documentation for texlive-punk-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn27389"

RPM_NAME = "texlive-punk-latex-doc-2023.201.1.1svn27389-53.2.noarch.rpm"
RPM_HASH = "575886d255e305b6222dd0c185c0b17a2ead4f274d26bd6a3973426a9dc4388473e741ec5562200712abfe6de0851f6a0aab352b978cb4c0e5536061954387e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
