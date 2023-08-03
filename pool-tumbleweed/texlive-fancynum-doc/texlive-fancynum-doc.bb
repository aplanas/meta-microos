SUMMARY = "Documentation for texlive-fancynum"
DESCRIPTION = "This package includes the documentation for texlive-fancynum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.92svn15878"

RPM_NAME = "texlive-fancynum-doc-2023.209.0.0.92svn15878-53.1.noarch.rpm"
RPM_HASH = "e736531c622cc49ff5a0d1c09643141a81ad546c4b2ed399068f3e5816d91b9f727d6c9bb423ce8e23c770cd4b0b5596b67333c333a3b6f4f1279e72c6274c8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancynum-doc"

RDEPENDS:${PN} += ""

inherit rpm
