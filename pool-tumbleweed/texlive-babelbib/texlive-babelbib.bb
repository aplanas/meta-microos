SUMMARY = "Multilingual bibliographies"
DESCRIPTION = "This package enables the user to generate multilingual \
bibliographies in cooperation with babel. Two approaches are \
possible: Each citation may be written in another language, or \
the whole bibliography can be typeset in a language chosen by \
the user. In addition, the package supports commands to change \
the typography of the bibliographies."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.34svn57349"

RPM_NAME = "texlive-babelbib-2023.209.1.34svn57349-54.1.noarch.rpm"
RPM_HASH = "738a4314ddfb4483c986ae3cf6acf8f303c257ce9a464085459675ceb70bbfeb92db4cefaf3c4f71b086f7b631911dc0ef626d539e098507f1db411138c1a430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-babelbib.sty \
texlive-babelbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
