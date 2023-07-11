SUMMARY = "Documentation for texlive-ltxtools"
DESCRIPTION = "This package includes the documentation for texlive-ltxtools"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.0.1asvn24897"

RPM_NAME = "texlive-ltxtools-doc-2023.208.0.0.0.1asvn24897-53.1.noarch.rpm"
RPM_HASH = "88d4bf81a61b962c5ac325b29e3d292566562f8f888eda38c49ebde691e1674fce4df3a76a6768ac6fae12e50967b03fd10d8464c6ba13ddb51c9c844306c7f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
