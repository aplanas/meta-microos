SUMMARY = "Documentation for texlive-pst-spinner"
DESCRIPTION = "This package includes the documentation for texlive-pst-spinner"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-doc-2023.201.1.02svn66115-53.2.noarch.rpm"
RPM_HASH = "8e578066eacaac111bd65051529b4a789ac80d9b56a6153438fa197db395cf04e8366a59d18e3cc693295b338555b5accdbe4511c892a07b6e6981bff8e32377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-spinner-doc"

RDEPENDS:${PN} += ""

inherit rpm
