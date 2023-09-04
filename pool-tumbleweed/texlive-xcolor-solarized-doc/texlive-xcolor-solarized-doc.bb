SUMMARY = "Documentation for texlive-xcolor-solarized"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-solarized"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-doc-2023.209.0.0.4svn61719-53.2.noarch.rpm"
RPM_HASH = "c12bcb8f3e4f4f1d3cca801599089315a00e22b9b0ccf4c975c34124ed45abd4f5e24b6e80f85a64a4c237b22e09342f92ebfb810a190eda5b09bf956e5df9c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-solarized-doc"

RDEPENDS:${PN} += ""

inherit rpm
