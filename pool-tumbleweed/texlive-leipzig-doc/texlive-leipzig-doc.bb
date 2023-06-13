SUMMARY = "Documentation for texlive-leipzig"
DESCRIPTION = "This package includes the documentation for texlive-leipzig"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn52450"

RPM_NAME = "texlive-leipzig-doc-2023.201.2.3svn52450-54.1.noarch.rpm"
RPM_HASH = "8855b598a582e18c07092e2a2f8a5b3a38dd59776d91611e83a4b0fb351aa19be2829a698523258f6ef9b6f9fe3a670f9f059b75295b25e4624bed81c1164de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leipzig-doc"

RDEPENDS:${PN} += ""

inherit rpm
