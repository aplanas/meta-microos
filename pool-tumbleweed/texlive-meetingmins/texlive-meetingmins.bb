SUMMARY = "Format written minutes of meetings"
DESCRIPTION = "The class allows formatting of meeting minutes using \\section \
commands (which provide hierarchical structure). An agenda can \
also be produced for distribution prior to the meeting, with \
user-selected portions suppressed from printing."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.6svn31878"

RPM_NAME = "texlive-meetingmins-2023.208.1.6svn31878-53.1.noarch.rpm"
RPM_HASH = "9e946485a9d9b490df774c3e4842aa7c86fc9a84c068994dc1c200e406ac90752962146a98211446c51b22408dd105b2cb81297dabd5e99e335ebbd195579b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-meetingmins.cls \
texlive-meetingmins"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-lmodern.sty \
tex-mathabx.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
