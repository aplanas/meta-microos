SUMMARY = "Documentation for texlive-ebsthesis"
DESCRIPTION = "This package includes the documentation for texlive-ebsthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-ebsthesis-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "8d15ae418587a9995ca754a918fbbffe1f5d8d8d8b443872c181126773a70f66dfd93723a6c32758cbd8e185003c67b11b4226e9f3b23eaf0984fc0f2b29fedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebsthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
