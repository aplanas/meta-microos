SUMMARY = "LaTeX package for quick typesetting"
DESCRIPTION = "Intended for the quick typesetting of basic documents using \
LaTeX using shortcuts to existing commands and specific \
commands for quick formatting and creation of tables and title \
pages with a graphic image."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-2023.201.0.0.1svn42183-53.1.noarch.rpm"
RPM_HASH = "2ea5bddda110fc5d9cf0054d43f1234948e4ccb4c135300e521140aaae8b46ae2dbcf5eb253751ba9307f36565c88f22a2cdb7bbadacd359b5d8c080e241c436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quicktype.sty \
texlive-quicktype"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
