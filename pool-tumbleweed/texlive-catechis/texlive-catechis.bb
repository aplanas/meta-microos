SUMMARY = "Macros for typesetting catechisms"
DESCRIPTION = "The macros include: format for question-and-answer; comments on \
answers; lengthier explanations of answers; citations. The \
formatting of all the macros is highly (and simply) \
customizable."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn59998"

RPM_NAME = "texlive-catechis-2023.201.2.6svn59998-52.1.noarch.rpm"
RPM_HASH = "17d73cf1d7aa0f3c56e158c7bbbd0dd282fbbc39620045f7e0639be69ac6796c7562983678be376ac03c0b4727d015ae5b0cb67138f2a52ec50d13b1adb83ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(catechis.sty) \
texlive-catechis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(paralist.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
