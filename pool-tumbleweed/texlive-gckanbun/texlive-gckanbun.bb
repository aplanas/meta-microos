SUMMARY = "Kanbun typesetting for (u)pLaTeX and LuaLaTeX"
DESCRIPTION = "This package provides a Kanbun (Han Wen , 'Chinese writing') \
typesetting for (u)pLaTeX and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61719"

RPM_NAME = "texlive-gckanbun-2023.209.1.2svn61719-53.1.noarch.rpm"
RPM_HASH = "85992244c7ff8a87accc471fec69357735656cbe1913ed8ef608354339e0a90c99aad9b1dd3fd025450af9081fd1cbbd13905e56f6392899db5da023bfe01408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gckanbun.sty \
texlive-gckanbun"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifuptex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
