SUMMARY = "Kanbun typesetting for (u)pLaTeX and LuaLaTeX"
DESCRIPTION = "This package provides a Kanbun (Han Wen , 'Chinese writing') \
typesetting for (u)pLaTeX and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61719"

RPM_NAME = "texlive-gckanbun-2023.201.1.2svn61719-52.1.noarch.rpm"
RPM_HASH = "3297935c41d003fd2bf54ea14f0704593eb3f76869ecfab3d97c612607d522503db81c3b7a811e971c056b0e9d9ee726bf8f0d9b87e0536eeb4b9cf7c95b2a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gckanbun.sty) \
texlive-gckanbun"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(ifuptex.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
