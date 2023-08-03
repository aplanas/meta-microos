SUMMARY = "Documentation for texlive-gaceta"
DESCRIPTION = "This package includes the documentation for texlive-gaceta"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn15878"

RPM_NAME = "texlive-gaceta-doc-2023.209.1.06svn15878-53.1.noarch.rpm"
RPM_HASH = "295f4c0f8421b5a4da7d9dd0a22d0a3cd8470dc48bbf5142c07859d0bd5d06c818a6b83e51df00e0e114e8a1b21d85a15c573de34f956dfd817656004401cadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gaceta-doc-es \
texlive-gaceta-doc"

RDEPENDS:${PN} += ""

inherit rpm
