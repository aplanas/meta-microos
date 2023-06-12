SUMMARY = "Documentation for texlive-bangorexam"
DESCRIPTION = "This package includes the documentation for texlive-bangorexam"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.0svn65140"

RPM_NAME = "texlive-bangorexam-doc-2023.201.1.5.0svn65140-53.1.noarch.rpm"
RPM_HASH = "3037cf9e62e1a12881722d88ce90011dcd6a0fda14e08a802553625a6815e226b2db0056e804b4799761bd7029955195fa112b25c0513a3fb2e9512fde42a7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangorexam-doc"
RDEPENDS:${PN} += ""

inherit rpm
