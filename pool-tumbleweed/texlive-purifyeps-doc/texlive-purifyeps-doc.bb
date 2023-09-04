SUMMARY = "Documentation for texlive-purifyeps"
DESCRIPTION = "This package includes the documentation for texlive-purifyeps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn29725"

RPM_NAME = "texlive-purifyeps-doc-2023.209.1.1svn29725-54.2.noarch.rpm"
RPM_HASH = "b836d14d772a59ed9294c4bb48c281158860dd62d4d5b655705981d6a708807f9136eccaff8ff4be3a5e45674410b569f9289458dee5fda85d05f5f6f87cce4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-purifyeps.1 \
texlive-purifyeps-doc"

RDEPENDS:${PN} += ""

inherit rpm
