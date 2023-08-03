SUMMARY = "Documentation for texlive-paper"
DESCRIPTION = "This package includes the documentation for texlive-paper"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0lsvn34521"

RPM_NAME = "texlive-paper-doc-2023.209.1.0lsvn34521-52.1.noarch.rpm"
RPM_HASH = "650e91e5dd9dae83b30d9ef540e1940228186121eca3627a6e796b970ce1db4346973c37f6b648633974c727715ec5c552053f6c1237d6dde0c70fddc397d571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-paper-doc-de \
texlive-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
