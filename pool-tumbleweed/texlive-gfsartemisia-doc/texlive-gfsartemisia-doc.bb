SUMMARY = "Documentation for texlive-gfsartemisia"
DESCRIPTION = "This package includes the documentation for texlive-gfsartemisia"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19469"

RPM_NAME = "texlive-gfsartemisia-doc-2023.201.1.0svn19469-52.1.noarch.rpm"
RPM_HASH = "6ffd6cd983efedc65c8817c9875d4a471470a11ba5119175bf0ef4903989b2121d4c2cb7d75b3d77eead271433603e91718cff9be56d2c7069c5cb36ec5b72e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsartemisia-doc"
RDEPENDS:${PN} += ""

inherit rpm
