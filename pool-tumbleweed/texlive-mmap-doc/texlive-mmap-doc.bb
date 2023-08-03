SUMMARY = "Documentation for texlive-mmap"
DESCRIPTION = "This package includes the documentation for texlive-mmap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn15878"

RPM_NAME = "texlive-mmap-doc-2023.209.1.03svn15878-55.1.noarch.rpm"
RPM_HASH = "634bbb82d6de46e8cfff7a3d7f86f9781c6c5268062aac1380467be941f24f2346196aa9c75695019d117c055e9c646d33936153e1d99be6ff7b2098df3e3361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
