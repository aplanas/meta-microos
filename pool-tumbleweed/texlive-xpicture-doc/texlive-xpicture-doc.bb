SUMMARY = "Documentation for texlive-xpicture"
DESCRIPTION = "This package includes the documentation for texlive-xpicture"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn28770"

RPM_NAME = "texlive-xpicture-doc-2023.209.1.2asvn28770-53.1.noarch.rpm"
RPM_HASH = "fe8e328d1b9b516540eb8b25fa19f53605e90bfb22b1e95bc87c733627bd7a263069ea49988e36c045167b0c102a007bb5694c945608c73f6e6fc3fee8176768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpicture-doc"

RDEPENDS:${PN} += ""

inherit rpm
