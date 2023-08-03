SUMMARY = "Documentation for texlive-texaccents"
DESCRIPTION = "This package includes the documentation for texlive-texaccents"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64447"

RPM_NAME = "texlive-texaccents-doc-2023.209.1.0.1svn64447-55.1.noarch.rpm"
RPM_HASH = "f093d8e2a05d3adf27f7db6acd4177d6454b4371a0bb29bba37f037427dad024d10f9bed8e03f03d1632df6bc5d7b00b52086d6438cae405d6a477da8d3909c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texaccents.1 \
texlive-texaccents-doc"

RDEPENDS:${PN} += ""

inherit rpm
