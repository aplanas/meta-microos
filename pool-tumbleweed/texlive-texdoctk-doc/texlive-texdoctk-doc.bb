SUMMARY = "Documentation for texlive-texdoctk"
DESCRIPTION = "This package includes the documentation for texlive-texdoctk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6.0svn62186"

RPM_NAME = "texlive-texdoctk-doc-2023.209.0.0.6.0svn62186-55.1.noarch.rpm"
RPM_HASH = "4fc93e40629bc9a62117c3368e7582d4b6aec5a3878b7299d18800055721f24a52d31706c490c6b70c755b0f1bdb5b9ca3de078c4f8c8ab92de1550431b3c8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdoctk.1 \
texlive-texdoctk-doc"

RDEPENDS:${PN} += ""

inherit rpm
