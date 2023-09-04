SUMMARY = "Documentation for texlive-ecobiblatex"
DESCRIPTION = "This package includes the documentation for texlive-ecobiblatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-doc-2023.209.1.0svn39233-54.2.noarch.rpm"
RPM_HASH = "b5d89a15ba8d84d8b657d0877185cd40a40c9d6bcd4e50552d18b2248b175b4f8a50d6e96bf0911f4244ab20fb98aabb40a09ac13b0729c63e767eeeb4cc39c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecobiblatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
