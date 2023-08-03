SUMMARY = "LaTeX package for quick typesetting"
DESCRIPTION = "Intended for the quick typesetting of basic documents using \
LaTeX using shortcuts to existing commands and specific \
commands for quick formatting and creation of tables and title \
pages with a graphic image."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-2023.209.0.0.1svn42183-54.1.noarch.rpm"
RPM_HASH = "7570eb3fef3ef7c824af1b99989f306cf6fa0d33db5247fdddd1d2148da63bfb88bd3784565d66ed7da9ce00c8b0a057b495942eaf3a2a0bb9b7eebeddc7512b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quicktype.sty \
texlive-quicktype"

RDEPENDS:${PN} += "/usr/bin/sh \
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
