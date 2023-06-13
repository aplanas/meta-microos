SUMMARY = "Documentation for texlive-novel"
DESCRIPTION = "This package includes the documentation for texlive-novel"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.80svn65848"

RPM_NAME = "texlive-novel-doc-2023.201.1.80svn65848-54.1.noarch.rpm"
RPM_HASH = "d798d7f15b60deff30e0f0c7d521c136e00afe1ff3ed01134e733c49acc366747ff7c283fd17d8a1ed3abdd9496c8d7485b4e705efdd78590fc377a450009086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-novel-doc"

RDEPENDS:${PN} += ""

inherit rpm
