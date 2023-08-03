SUMMARY = "A class file to typeset screenplays"
DESCRIPTION = "The class implements the format recommended by the Academy of \
Motion Picture Arts and Sciences."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn27223"

RPM_NAME = "texlive-screenplay-2023.209.1.6svn27223-54.1.noarch.rpm"
RPM_HASH = "7277754349b93eb67220bf928c265312ca0fcf9df793137ca78cb2e54d1ef520b2d1bec32a9c6842ce075edb44e5f080b79f55c52f432e56e19889536ebff125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hardmarg.sty \
tex-screenplay.cls \
texlive-screenplay"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-courier.sty \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
