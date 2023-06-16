SUMMARY = "Typeset diaries or journals"
DESCRIPTION = "A class, based on scrbook, designed for typesetting diaries, \
journals or devotionals."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn27810"

RPM_NAME = "texlive-scrjrnl-2023.201.0.0.1svn27810-53.1.noarch.rpm"
RPM_HASH = "0e923dfea853921edb6e19369f7afc5ab561ef69674a1186f93e4c83e2fa4ffbaba6c08effcd6bb5adab8940a04fc15243d858fe5b6378da598beea9f3856882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrjrnl.cls \
texlive-scrjrnl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-datetime.sty \
tex-fancytabs.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
