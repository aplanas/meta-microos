SUMMARY = "Documentation for texlive-tokenizer"
DESCRIPTION = "This package includes the documentation for texlive-tokenizer"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn15878"

RPM_NAME = "texlive-tokenizer-doc-2023.201.1.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "bdf8fff50be0b585ec39b99e085362a49a31e0976bc8e1754b38157ced46610c271af5b71fb2bc27ae8e105d73feb5533f2bf4df577c3d34544e5ed99d64e31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tokenizer-doc"

RDEPENDS:${PN} += ""

inherit rpm
