SUMMARY = "Documentation for texlive-delimtxt"
DESCRIPTION = "This package includes the documentation for texlive-delimtxt"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn16549"

RPM_NAME = "texlive-delimtxt-doc-2023.201.svn16549-52.1.noarch.rpm"
RPM_HASH = "86ee2d31b95ae837b23d4bbb878bb4e59b3c01b280756ccaff07afa0856d3b7340e1ffc1eac3e5369ce0e8fe851f481cd2ef7ae9d401b6aef3f02500dff8d2ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delimtxt-doc"

RDEPENDS:${PN} += ""

inherit rpm
