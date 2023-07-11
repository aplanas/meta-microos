SUMMARY = "Documentation for texlive-mathexam"
DESCRIPTION = "This package includes the documentation for texlive-mathexam"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.00svn15878"

RPM_NAME = "texlive-mathexam-doc-2023.208.1.00svn15878-53.1.noarch.rpm"
RPM_HASH = "e2cfea46fcc109a9b10402f3a26bff8f5d5a127e0c3aed3da2619c90a20341cfce707e2706f71979f3b7ffc98ffdf59a97f53fee0dd9ba4aa2cbc1d082ed644e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
