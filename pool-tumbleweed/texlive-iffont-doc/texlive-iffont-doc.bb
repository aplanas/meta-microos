SUMMARY = "Documentation for texlive-iffont"
DESCRIPTION = "This package includes the documentation for texlive-iffont"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn38823"

RPM_NAME = "texlive-iffont-doc-2023.201.1.0.0svn38823-52.1.noarch.rpm"
RPM_HASH = "1ae1d07ce01fd8f1d71da5ed7e13fb6d3b47bdece4b14440dc3ffa20c0e85067e795a15ece789eb2e32f2bbca34766b8772a9ae654179c20a2ec2af8ba0ac4a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iffont-doc"
RDEPENDS:${PN} += ""

inherit rpm
