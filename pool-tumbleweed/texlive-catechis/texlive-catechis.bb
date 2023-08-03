SUMMARY = "Macros for typesetting catechisms"
DESCRIPTION = "The macros include: format for question-and-answer; comments on \
answers; lengthier explanations of answers; citations. The \
formatting of all the macros is highly (and simply) \
customizable."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn59998"

RPM_NAME = "texlive-catechis-2023.209.2.6svn59998-53.1.noarch.rpm"
RPM_HASH = "d8a11f7eafb6aafb5535124265c23cccb229da9be5767bcced890f7b7eb512b0b8edc49b3ff1099512313b377b88d11ea0d83931c214a894b47a7fb2215d614d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catechis.sty \
texlive-catechis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-paralist.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
