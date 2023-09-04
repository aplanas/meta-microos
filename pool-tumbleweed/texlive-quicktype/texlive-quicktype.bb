SUMMARY = "LaTeX package for quick typesetting"
DESCRIPTION = "Intended for the quick typesetting of basic documents using \
LaTeX using shortcuts to existing commands and specific \
commands for quick formatting and creation of tables and title \
pages with a graphic image."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-2023.209.0.0.1svn42183-54.2.noarch.rpm"
RPM_HASH = "50455fc5f3bd0ce34e81cec9660407b8454e6572d7829b2527cc39bac54a70c2b6c285ff5ca29d9c6212b849c3b3fefc3c3eb1706a036e0de5d1b58516f0b9d4"
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
