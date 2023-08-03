SUMMARY = "Documentation for texlive-ascelike"
DESCRIPTION = "This package includes the documentation for texlive-ascelike"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn29129"

RPM_NAME = "texlive-ascelike-doc-2023.209.2.3svn29129-54.1.noarch.rpm"
RPM_HASH = "630072c976b7d8d9bcd6ed7b25de70b10ecf6d58747c7c189e808290f4b1278748dbb37dea3e4e94b7a4e2421485f472d3ef7fb2a34f8ea53414ea8c40abdc7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ascelike-doc"

RDEPENDS:${PN} += ""

inherit rpm
