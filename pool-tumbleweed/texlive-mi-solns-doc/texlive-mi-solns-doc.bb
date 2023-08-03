SUMMARY = "Documentation for texlive-mi-solns"
DESCRIPTION = "This package includes the documentation for texlive-mi-solns"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn49651"

RPM_NAME = "texlive-mi-solns-doc-2023.209.0.0.6svn49651-55.1.noarch.rpm"
RPM_HASH = "2cbad8250081f7eb3cadf8bf73b46c8f667655860582fad7001d11733e86d384c36b15fcb8b234286da13a18c2989769c82c6dc45eda4622ce9977d0e9516067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mi-solns-doc"

RDEPENDS:${PN} += ""

inherit rpm
