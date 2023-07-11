SUMMARY = "Documentation for texlive-ebsthesis"
DESCRIPTION = "This package includes the documentation for texlive-ebsthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-ebsthesis-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "12285b491ea225d3307da349d351d788d0438913cd99abcc5a4702cc11382082d7cba88db875cd71918c98409fb9569cf77b5faafd410d7243c3e13173845341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
