SUMMARY = "Documentation for texlive-varsfromjobname"
DESCRIPTION = "This package includes the documentation for texlive-varsfromjobname"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44154"

RPM_NAME = "texlive-varsfromjobname-doc-2023.209.1.0svn44154-54.1.noarch.rpm"
RPM_HASH = "fbd7e2d042ea9ac4f1d34bbd128594860ac21cf9671810edf30dd3d97bc5f480fc98e69f0e68e60a7ba3ca6203fc0dddfa78cf855ad253b6a12d3bb271a3d03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varsfromjobname-doc"

RDEPENDS:${PN} += ""

inherit rpm
