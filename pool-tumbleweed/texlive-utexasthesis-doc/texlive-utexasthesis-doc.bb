SUMMARY = "Documentation for texlive-utexasthesis"
DESCRIPTION = "This package includes the documentation for texlive-utexasthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48648"

RPM_NAME = "texlive-utexasthesis-doc-2023.201.1.0svn48648-53.1.noarch.rpm"
RPM_HASH = "46a66478db3f84a0ae0bf5b72d7e6a9336402f2259a5d9d5815037148cf416181c21e3cd0543b5b180b1a63d8ea915c47afa12ccd7a8d97e1e685a5f27f1c224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utexasthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
