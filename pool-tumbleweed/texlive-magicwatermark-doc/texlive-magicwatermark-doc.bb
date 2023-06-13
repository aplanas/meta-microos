SUMMARY = "Documentation for texlive-magicwatermark"
DESCRIPTION = "This package includes the documentation for texlive-magicwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn63656"

RPM_NAME = "texlive-magicwatermark-doc-2023.201.1.0.1svn63656-52.1.noarch.rpm"
RPM_HASH = "f3bfe5c4984424ec7a66d986e63dbef220d1b93bf2b349bef8b95ab55fb0bcf7dc7803d40a95d0284437d6338d0db4a5df86cc010979fc35646ea6a31d3a7a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-magicwatermark-doc:zh) \
texlive-magicwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
