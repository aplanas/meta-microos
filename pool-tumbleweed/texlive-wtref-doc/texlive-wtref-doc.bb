SUMMARY = "Documentation for texlive-wtref"
DESCRIPTION = "This package includes the documentation for texlive-wtref"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn55558"

RPM_NAME = "texlive-wtref-doc-2023.209.0.0.4.0svn55558-53.1.noarch.rpm"
RPM_HASH = "080c53b7327128862c0207e477883cd01ba7ec9b8c863461aa71d2dff1934b2bfe035cba5a9d3ceaf45fd1c18d77cef82bac63b9fcf2e81cd1f2dfcebd4c5ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wtref-doc-ja \
texlive-wtref-doc"

RDEPENDS:${PN} += ""

inherit rpm
