SUMMARY = "Documentation for texlive-nrc"
DESCRIPTION = "This package includes the documentation for texlive-nrc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01asvn29027"

RPM_NAME = "texlive-nrc-doc-2023.201.2.01asvn29027-54.1.noarch.rpm"
RPM_HASH = "e187c3e846f5925e8f2593590e95e452c89854a036e060e946843417d1fea0627b1c8256891b3b6fd30d3839d9340ff389d6e671932bbe9851b403e21980b974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nrc-doc"

RDEPENDS:${PN} += ""

inherit rpm
