SUMMARY = "Documentation for texlive-multiaudience"
DESCRIPTION = "This package includes the documentation for texlive-multiaudience"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn60688"

RPM_NAME = "texlive-multiaudience-doc-2023.201.1.04svn60688-54.1.noarch.rpm"
RPM_HASH = "e23c92187e7df45fdebd70894b6f63b8ad90ee90ee25b17bdc7b87d0593385c0efc1e3cd9a259326773b0a9100b5c7ac4bc0cf8e078407d6768b797b9d52eb99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiaudience-doc"
RDEPENDS:${PN} += ""

inherit rpm
