SUMMARY = "Documentation for texlive-pst-cie"
DESCRIPTION = "This package includes the documentation for texlive-pst-cie"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06bsvn60959"

RPM_NAME = "texlive-pst-cie-doc-2023.209.1.06bsvn60959-53.1.noarch.rpm"
RPM_HASH = "0e2d58a01730f9c70bcfb7b008d2d4d3f9988868662531bde50dd9bd77819972cd0a05360f1b888368ee5bf4c6fd8c1b9b199dcc84387bb5745c3fe56347ee0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-cie-doc"

RDEPENDS:${PN} += ""

inherit rpm
