SUMMARY = "Documentation for texlive-luatextra"
DESCRIPTION = "This package includes the documentation for texlive-luatextra"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0.1svn20747"

RPM_NAME = "texlive-luatextra-doc-2023.201.1.0.1svn20747-52.1.noarch.rpm"
RPM_HASH = "0015aecf7189a4ae5772c4877f6872139c76ccf769c764383a797aa2b4c54d877c03345ea7bab44e1915834a3725296820380b979417f242e60d98e097a94627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatextra-doc"
RDEPENDS:${PN} += ""

inherit rpm
