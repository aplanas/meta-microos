SUMMARY = "Documentation for texlive-smflatex"
DESCRIPTION = "This package includes the documentation for texlive-smflatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn58910"

RPM_NAME = "texlive-smflatex-doc-2023.209.1.6svn58910-58.1.noarch.rpm"
RPM_HASH = "28c0b066286f59f59bd53b266cecd8076925f4e1381b52ccdf38426bdd3b97804891f7db5d0d84b549624b8f215b9ec98024b3cbd3711ca799db3930bb206d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-smflatex-doc-fr \
texlive-smflatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
