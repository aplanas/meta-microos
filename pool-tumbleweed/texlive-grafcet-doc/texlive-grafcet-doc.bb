SUMMARY = "Documentation for texlive-grafcet"
DESCRIPTION = "This package includes the documentation for texlive-grafcet"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-doc-2023.209.1.3.5svn22509-54.1.noarch.rpm"
RPM_HASH = "31c9b6bbbc00707bec24b993a9ff506b7c1be30b24af974a284b5b6b75d90b6bb8ca57ac357e9716a2b11d7296505d998f058be76258a061ca8baabb40197100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-grafcet-doc-fr \
texlive-grafcet-doc"

RDEPENDS:${PN} += ""

inherit rpm
