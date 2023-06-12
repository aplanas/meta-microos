SUMMARY = "Documentation for texlive-messagepassing"
DESCRIPTION = "This package includes the documentation for texlive-messagepassing"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn63116"

RPM_NAME = "texlive-messagepassing-doc-2023.201.1.0svn63116-54.1.noarch.rpm"
RPM_HASH = "f49346835b4f2a0eaa3a7feb888a019fd906446ef87fdb22957c834df76953d688ff13ea37d154f59ae0df72611f5555b3798b53742b66861c7631ba7a443d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-messagepassing-doc"
RDEPENDS:${PN} += ""

inherit rpm
