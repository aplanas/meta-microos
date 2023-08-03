SUMMARY = "A personal class for writing journals"
DESCRIPTION = "This LaTeX document class enables the user to turn simple pure \
text entries into a colorful and nicely formatted journal."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65480"

RPM_NAME = "texlive-jwjournal-2023.209.svn65480-56.1.noarch.rpm"
RPM_HASH = "c02e4aacc77ac50921f2a41b0ce28291051b762de70e721af61251c9b9ce2a84353cb9e622388e726a9a98de041612bba59fa7ee2e90972581e440177cd86db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jwjournal.cls \
texlive-jwjournal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ProjLib.sty \
tex-enumitem.sty \
tex-needspace.sty \
tex-tcolorbox.sty \
texlive \
texlive-einfart \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
