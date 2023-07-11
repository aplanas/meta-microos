SUMMARY = "Documentation for texlive-zxjatype"
DESCRIPTION = "This package includes the documentation for texlive-zxjatype"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn53500"

RPM_NAME = "texlive-zxjatype-doc-2023.201.0.0.7svn53500-52.2.noarch.rpm"
RPM_HASH = "efe21319b547ddd013b7f67ce2cbc57eab7b6028996339fc6ec0bb4cb19b2447e3b0c7faaf9385a761d5f1889a0dbf6145d5c532b1a88192486d6de9ab1ee043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zxjatype-doc-ja \
texlive-zxjatype-doc"

RDEPENDS:${PN} += ""

inherit rpm
