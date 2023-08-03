SUMMARY = "Documentation for texlive-natbib"
DESCRIPTION = "This package includes the documentation for texlive-natbib"
LICENSE = "LPPL-1.0"

PV = "2023.209.8.31bsvn20668"

RPM_NAME = "texlive-natbib-doc-2023.209.8.31bsvn20668-55.1.noarch.rpm"
RPM_HASH = "e4510e52422b8a443c05ad51136223cef05e03d18b565e81f0bedda240058b64efe4bfaaa60f1333907d4c3256c24c3e620328489d8d560e69d21b9131ce5b1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-natbib-doc-en \
texlive-natbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
