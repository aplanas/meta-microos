SUMMARY = "Documentation for texlive-iso"
DESCRIPTION = "This package includes the documentation for texlive-iso"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn15878"

RPM_NAME = "texlive-iso-doc-2023.209.2.4svn15878-56.1.noarch.rpm"
RPM_HASH = "4a45b2e8d393cebd1c6a697fb4dd2fb8c2ad83a192dfbd3cc96a41c04cb6c2e3b26b0a2b789af64ad4096790057f7893b8e87335db2eb8d3cceea0e06be78cd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iso-doc"

RDEPENDS:${PN} += ""

inherit rpm
