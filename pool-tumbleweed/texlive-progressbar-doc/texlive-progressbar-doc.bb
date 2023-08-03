SUMMARY = "Documentation for texlive-progressbar"
DESCRIPTION = "This package includes the documentation for texlive-progressbar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0b_4svn33822"

RPM_NAME = "texlive-progressbar-doc-2023.209.1.0b_4svn33822-53.1.noarch.rpm"
RPM_HASH = "5cbdc46a4010f4d112f77d3e7a7764ec0187d2e28ffddf31a19ef0269b898efd9b61caa99068a52aecfb92f6487fab7b2df3b177535c1aac8f4c114b644dfbd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-progressbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
