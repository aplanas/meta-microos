SUMMARY = "Documentation for texlive-zhlipsum"
DESCRIPTION = "This package includes the documentation for texlive-zhlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-doc-2023.209.1.2.0svn54994-53.2.noarch.rpm"
RPM_HASH = "f94202b319fb9c1e41da55ed706d34c9355fa4e1d224c5b92d21097e48f301ec3e2740ea0e6307e1b5d5d7f772ba69aaf70ca41976589da47f891bc56e25889a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhlipsum-doc-en;zh \
texlive-zhlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
