SUMMARY = "Documentation for texlive-clearsans"
DESCRIPTION = "This package includes the documentation for texlive-clearsans"
LICENSE = "Apache-1.0"

PV = "2023.209.svn64400"

RPM_NAME = "texlive-clearsans-doc-2023.209.svn64400-54.1.noarch.rpm"
RPM_HASH = "b2a140813ff9548892a8674d996935ad72ace4e73c1f042344af894eb4120297aa8ec338fabeaad90e06fa3a4bc80a52826632d34c10f1ff7d347ca1763ed4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clearsans-doc"

RDEPENDS:${PN} += ""

inherit rpm
