SUMMARY = "Documentation for texlive-tucv"
DESCRIPTION = "This package includes the documentation for texlive-tucv"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn20680"

RPM_NAME = "texlive-tucv-doc-2023.209.1.0svn20680-53.1.noarch.rpm"
RPM_HASH = "180b32fd6044b7463058dcb02eceab8bbce44b4ff72eb48cfe8e970f2d33ea4a9f25d188f8a4506517d6938301a9b4a8369bd3b653c7f442ac198bb32a5e069c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tucv-doc"

RDEPENDS:${PN} += ""

inherit rpm
