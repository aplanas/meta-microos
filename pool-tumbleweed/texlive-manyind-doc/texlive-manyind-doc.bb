SUMMARY = "Documentation for texlive-manyind"
DESCRIPTION = "This package includes the documentation for texlive-manyind"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49874"

RPM_NAME = "texlive-manyind-doc-2023.201.svn49874-52.1.noarch.rpm"
RPM_HASH = "19bb2daf5acad3eda697c06bd5ee31bfb09427fc0a7fa3301d9603031e8c09429e4077454054fb8a3b2cd901a9563ea929a6aee0df2af1f1140f07273b72b3b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-manyind-doc"

RDEPENDS:${PN} += ""

inherit rpm
