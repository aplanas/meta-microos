SUMMARY = "Documentation for texlive-protocol"
DESCRIPTION = "This package includes the documentation for texlive-protocol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.13svn25562"

RPM_NAME = "texlive-protocol-doc-2023.201.1.13svn25562-52.1.noarch.rpm"
RPM_HASH = "97286a73cf9256b4b8c2df98cde39718540383e869951ab50c9574a2938c905a942aa35450d7bbd12f519b7ba2a37d7f3b7aefe45bd6b403ea612728ccfd8bfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-protocol-doc:en;de) \
texlive-protocol-doc"
RDEPENDS:${PN} += ""

inherit rpm
