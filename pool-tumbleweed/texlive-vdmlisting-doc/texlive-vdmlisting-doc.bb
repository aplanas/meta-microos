SUMMARY = "Documentation for texlive-vdmlisting"
DESCRIPTION = "This package includes the documentation for texlive-vdmlisting"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56905"

RPM_NAME = "texlive-vdmlisting-doc-2023.209.1.1svn56905-54.1.noarch.rpm"
RPM_HASH = "d9b79bbd21234d44ca5ae78b32cfbbb5ae4915a961ca01772f3ae3952ab6aede6512e387a70f5556f6a05a9517c1f9de3838c004a95b8c764a698264bc64e7dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vdmlisting-doc"

RDEPENDS:${PN} += ""

inherit rpm
