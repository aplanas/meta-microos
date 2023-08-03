SUMMARY = "Documentation for texlive-skrapport"
DESCRIPTION = "This package includes the documentation for texlive-skrapport"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12ksvn52412"

RPM_NAME = "texlive-skrapport-doc-2023.209.0.0.12ksvn52412-58.1.noarch.rpm"
RPM_HASH = "142d70a36c442d2bf4215a004d6b3c528251f8db00efbf4727e8881345d9347316120cbd482158eccb063ec072732c1e0155a230785e039e36ef2a747adc4c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skrapport-doc"

RDEPENDS:${PN} += ""

inherit rpm
