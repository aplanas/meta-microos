SUMMARY = "Documentation for texlive-luamesh"
DESCRIPTION = "This package includes the documentation for texlive-luamesh"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.7svn63875"

RPM_NAME = "texlive-luamesh-doc-2023.208.0.0.7svn63875-53.1.noarch.rpm"
RPM_HASH = "83114e0499d3136b1cd57d6a1e35eb873dc0eda1a20450a6157c62e20e5bc03df3c111ee5946df5aa54686c1befa58bed8986502c92b62964765dd1a0d9d7fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamesh-doc"

RDEPENDS:${PN} += ""

inherit rpm
