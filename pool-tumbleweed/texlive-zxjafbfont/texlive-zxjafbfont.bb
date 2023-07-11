SUMMARY = "Fallback CJK font support for xeCJK"
DESCRIPTION = "The zxjafbfont package"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn28539"

RPM_NAME = "texlive-zxjafbfont-2023.201.0.0.2svn28539-52.2.noarch.rpm"
RPM_HASH = "f9d477c5e4f6326330313da751e9801e58a66e1a3cc70e095d34ba452c163bbfdaaf5ab992c0856d7508acbb29b686c24aeedcf3f61ffccecdf5339704391b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjafbfont.sty \
texlive-zxjafbfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xeCJK.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
