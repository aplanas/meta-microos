SUMMARY = "Documentation for texlive-amsrefs"
DESCRIPTION = "This package includes the documentation for texlive-amsrefs"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn61937"

RPM_NAME = "texlive-amsrefs-doc-2023.209.2.14svn61937-55.1.noarch.rpm"
RPM_HASH = "ea66fb9a2031183119462d9d47253891199dd102c582fb42765f01158e11e5ec565f8acc0086d761c03e4156118ed29f5fad22d2681a2540fb07dd80552d26f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsrefs-doc"

RDEPENDS:${PN} += ""

inherit rpm
