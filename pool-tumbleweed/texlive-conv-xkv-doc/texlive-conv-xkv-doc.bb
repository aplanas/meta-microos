SUMMARY = "Documentation for texlive-conv-xkv"
DESCRIPTION = "This package includes the documentation for texlive-conv-xkv"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43558"

RPM_NAME = "texlive-conv-xkv-doc-2023.209.svn43558-55.1.noarch.rpm"
RPM_HASH = "146ce0652bc2efc4176abc8cf086d849d785cf6b5253ee78d510ed0e1d8c7bbd7fe8f134dac54d87f709135c6f10b9a973837a4e875d38be9866dcae8ff54fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-conv-xkv-doc"

RDEPENDS:${PN} += ""

inherit rpm
