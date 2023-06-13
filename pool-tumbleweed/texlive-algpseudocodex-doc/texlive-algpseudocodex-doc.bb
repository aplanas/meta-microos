SUMMARY = "Documentation for texlive-algpseudocodex"
DESCRIPTION = "This package includes the documentation for texlive-algpseudocodex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn65860"

RPM_NAME = "texlive-algpseudocodex-doc-2023.201.1.1.0svn65860-54.1.noarch.rpm"
RPM_HASH = "4ac7bc3b488c8fb7fdcd61ac309b2f3e5468b4178de55c287ee0837a0128c449a369bae0b688cb298ac0465daa57f88617f3752ae0cc728978a6b00d5234a24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algpseudocodex-doc"

RDEPENDS:${PN} += ""

inherit rpm
