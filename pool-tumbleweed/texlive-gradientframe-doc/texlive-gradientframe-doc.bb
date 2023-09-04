SUMMARY = "Documentation for texlive-gradientframe"
DESCRIPTION = "This package includes the documentation for texlive-gradientframe"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-doc-2023.209.0.0.2svn21387-54.2.noarch.rpm"
RPM_HASH = "614c8f83a803958f04c4bf9b23759d767ca6638584022602637c7791a56a0a9c335b77f6449e546760c4576898ba1c52349ebaafffb9481c281f6e752bd03e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradientframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
