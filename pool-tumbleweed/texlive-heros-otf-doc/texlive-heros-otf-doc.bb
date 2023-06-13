SUMMARY = "Documentation for texlive-heros-otf"
DESCRIPTION = "This package includes the documentation for texlive-heros-otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn64695"

RPM_NAME = "texlive-heros-otf-doc-2023.201.0.0.01svn64695-53.1.noarch.rpm"
RPM_HASH = "709e3e3f88612ff5c5213857309fc75f4a97416dd1e608524e86c4130e39a03201586f69fd7d8bf21e595574b607b835a08bfb1b8de44600917e34a9e648cd85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heros-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
