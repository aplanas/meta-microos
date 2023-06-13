SUMMARY = "Documentation for texlive-glossaries-portuges"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-portuges"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-doc-2023.201.1.1svn36064-53.1.noarch.rpm"
RPM_HASH = "388c84d022cd230b2b999ebcd40da9307a78c334e6af7d9acd36eff57fea77df7956579e42ae66d9cff81d9363a5565c3b5e98e7200df490b031630a9f35ae6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
