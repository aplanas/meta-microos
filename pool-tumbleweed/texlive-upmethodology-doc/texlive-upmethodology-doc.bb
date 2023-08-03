SUMMARY = "Documentation for texlive-upmethodology"
DESCRIPTION = "This package includes the documentation for texlive-upmethodology"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.20221004svn64613"

RPM_NAME = "texlive-upmethodology-doc-2023.209.20221004svn64613-54.1.noarch.rpm"
RPM_HASH = "43f92d9be94be65834e167bb6cf153294649a4ec7d3d5922d2f18ed61bb8b917b92a1578f721438b968a4ec881d5b8c10545481acf470fb78b2857725e960551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upmethodology-doc"

RDEPENDS:${PN} += ""

inherit rpm
