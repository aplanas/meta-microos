SUMMARY = "Documentation for texlive-quotmark"
DESCRIPTION = "This package includes the documentation for texlive-quotmark"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-quotmark-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "735d30bd4ec29554d39ccb7225b0ef355a686627e765a2b4434350521697782c406cc08e8a9c396ea35681b55982a2471d0241a4e8fd39114fe2a905959ef6f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
