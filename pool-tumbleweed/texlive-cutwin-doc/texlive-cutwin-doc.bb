SUMMARY = "Documentation for texlive-cutwin"
DESCRIPTION = "This package includes the documentation for texlive-cutwin"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn60901"

RPM_NAME = "texlive-cutwin-doc-2023.209.0.0.2svn60901-55.1.noarch.rpm"
RPM_HASH = "0d53577a1cd7bb230ec7bb2a5ef5a22389728c2abee1df179275f815d9fad1732dc8572c7d5447ecf17320fea1871f4acab592e8f59ec950eba17e72a4ff5bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cutwin-doc"

RDEPENDS:${PN} += ""

inherit rpm
