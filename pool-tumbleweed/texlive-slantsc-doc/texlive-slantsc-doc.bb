SUMMARY = "Documentation for texlive-slantsc"
DESCRIPTION = "This package includes the documentation for texlive-slantsc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn25007"

RPM_NAME = "texlive-slantsc-doc-2023.209.2.11svn25007-58.1.noarch.rpm"
RPM_HASH = "3bd9833bc37bdf62f29ed927d936a7b7cd2b1c61cbce0a5a5bfecfd0689101e5da06e11fadf783bb1c305bf2095f271ac0d23243c52640d2841b518002b3abdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slantsc-doc"

RDEPENDS:${PN} += ""

inherit rpm
