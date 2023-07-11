SUMMARY = "Documentation for texlive-hanging"
DESCRIPTION = "This package includes the documentation for texlive-hanging"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn15878"

RPM_NAME = "texlive-hanging-doc-2023.201.1.2bsvn15878-53.2.noarch.rpm"
RPM_HASH = "1aaeb8d836f793f4ce7ab1f5e3b5e2e8201d950faaabac719fd7e4f19155fe9df61f7c46461fb572155079331ef2d5a026ea31147b1c7d445f81ca999394f790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hanging-doc"

RDEPENDS:${PN} += ""

inherit rpm
