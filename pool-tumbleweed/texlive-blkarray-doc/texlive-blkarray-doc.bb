SUMMARY = "Documentation for texlive-blkarray"
DESCRIPTION = "This package includes the documentation for texlive-blkarray"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07svn36406"

RPM_NAME = "texlive-blkarray-doc-2023.209.0.0.07svn36406-53.1.noarch.rpm"
RPM_HASH = "24180f2fe0d1fa05a9a95d42f5b0ba1907b8fb3e5c69d09945afe84665802069d2bc5c070c5dbb07ec5f83c3ff2e5f6592c523c8268e66fe41556bbbce9cbd98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blkarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
