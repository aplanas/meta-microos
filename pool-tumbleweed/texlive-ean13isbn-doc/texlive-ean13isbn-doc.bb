SUMMARY = "Documentation for texlive-ean13isbn"
DESCRIPTION = "This package includes the documentation for texlive-ean13isbn"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57514"

RPM_NAME = "texlive-ean13isbn-doc-2023.201.svn57514-53.1.noarch.rpm"
RPM_HASH = "ee008d742dd5b922c2f9a9691984345c4da331a6e7796fd820b974ca58802ff0789e8d01eeb08518451f641a2ace2eef5d0be8a696a92c90eb032a4983cdc313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean13isbn-doc"
RDEPENDS:${PN} += ""

inherit rpm
