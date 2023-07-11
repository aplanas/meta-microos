SUMMARY = "Documentation for texlive-hopatch"
DESCRIPTION = "This package includes the documentation for texlive-hopatch"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn65491"

RPM_NAME = "texlive-hopatch-doc-2023.201.1.5svn65491-53.2.noarch.rpm"
RPM_HASH = "8b9f0e90f4a9bfdaf6069e91d72f78a986cd3dbfb88922d096cb62729e6f1a40c4b8517f1acb7a5455bb4e8c359b11043afb4c06b3ea844db95a814b86bda2f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hopatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
