SUMMARY = "Documentation for texlive-esieecv"
DESCRIPTION = "This package includes the documentation for texlive-esieecv"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59638"

RPM_NAME = "texlive-esieecv-doc-2023.209.svn59638-54.1.noarch.rpm"
RPM_HASH = "82ab19360ab84d9abaffdeec1523e45f1844910d892da464715fc0309e8bb627afbac7ea4e156ec47f7f3f011244c0aca5cccac1982aa43bc70e2b8e09093aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esieecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
