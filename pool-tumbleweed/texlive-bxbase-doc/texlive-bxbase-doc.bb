SUMMARY = "Documentation for texlive-bxbase"
DESCRIPTION = "This package includes the documentation for texlive-bxbase"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn66115"

RPM_NAME = "texlive-bxbase-doc-2023.209.1.2asvn66115-53.1.noarch.rpm"
RPM_HASH = "600390cd271b33c43537cd5eab7af56cb16ae40761b6712ccb6030b8785407fac47c6509d97a8d78fe11e40ae6bf7796c93a5b71e7cd4879d6a726a291f67429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxbase-doc-ja \
texlive-bxbase-doc"

RDEPENDS:${PN} += ""

inherit rpm
