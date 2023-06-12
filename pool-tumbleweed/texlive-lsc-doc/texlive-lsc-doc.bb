SUMMARY = "Documentation for texlive-lsc"
DESCRIPTION = "This package includes the documentation for texlive-lsc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-lsc-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "af2a02e91ad4241f9f268947a6324dccd2effbf96f9eecb5e078d43bd5c89c883f81259d8a3b4028be9f3c509da3edfae646d99f3bec8da6655e2198a2a5c8df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lsc-doc"
RDEPENDS:${PN} += ""

inherit rpm
