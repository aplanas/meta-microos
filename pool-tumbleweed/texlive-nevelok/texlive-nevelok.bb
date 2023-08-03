SUMMARY = "LaTeX package for automatic definite articles for Hungarian"
DESCRIPTION = "LaTeX package for automatic definite articles for Hungarian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn39029"

RPM_NAME = "texlive-nevelok-2023.209.1.03svn39029-55.1.noarch.rpm"
RPM_HASH = "a219aa8e570a2baba8aa4214f80974c98060f50dd688454679f3dfa134cf6653f3b37923bd9347434a21415c9fe6bddb0c901f1271aa9bbc41ed4e9570f2bdd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nevelok.sty \
texlive-nevelok"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
