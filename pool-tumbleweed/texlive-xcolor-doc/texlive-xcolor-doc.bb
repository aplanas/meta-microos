SUMMARY = "Documentation for texlive-xcolor"
DESCRIPTION = "This package includes the documentation for texlive-xcolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn63563"

RPM_NAME = "texlive-xcolor-doc-2023.201.2.14svn63563-52.2.noarch.rpm"
RPM_HASH = "86b1570dd4a23147c42ef4bc81865cd89bddd7571f9eeef959a116af1f7e15a26a4b601e199c00e72e7f025a5ebc445980e73bc0b9247815d0d84df731680e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
