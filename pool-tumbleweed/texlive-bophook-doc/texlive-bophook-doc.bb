SUMMARY = "Documentation for texlive-bophook"
DESCRIPTION = "This package includes the documentation for texlive-bophook"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn17062"

RPM_NAME = "texlive-bophook-doc-2023.209.0.0.02svn17062-53.1.noarch.rpm"
RPM_HASH = "d49235c7971f5768c5ae9093a4a8e9e2f568a0bc2c7f210269cdbf807307f6bf885472a1a3af968822428e5bc9bff6345fc9e05fba33076e7a00e6cedc70f7b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bophook-doc"

RDEPENDS:${PN} += ""

inherit rpm
