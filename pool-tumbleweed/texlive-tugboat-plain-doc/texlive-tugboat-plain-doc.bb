SUMMARY = "Documentation for texlive-tugboat-plain"
DESCRIPTION = "This package includes the documentation for texlive-tugboat-plain"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.27svn63386"

RPM_NAME = "texlive-tugboat-plain-doc-2023.209.1.27svn63386-53.1.noarch.rpm"
RPM_HASH = "62e4b0a0bcdc6ae2ff9890875231de6f70b8c119ebf5cf8b41138a205be2667a322ea3cfc4235f15b0031b15cd731441eea9a576e8471dad2631795e478dd5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tugboat-plain-doc"

RDEPENDS:${PN} += ""

inherit rpm
