SUMMARY = "Manage and index acronyms and terms"
DESCRIPTION = "Yet another package for acronyms: the package offers simple \
markup of acronyms and technical terms in the text, giving an \
index each of terms and acronyms with their expanded form."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn61719"

RPM_NAME = "texlive-acroterm-2023.201.0.0.1svn61719-54.1.noarch.rpm"
RPM_HASH = "95d3e0660ce58cdfa0950d6d291ddd78923b744527ee6fc4fcb9c57a66b9758e37f85db11324b3c1c929aedbf26f86a2dff4638b0a994f765e4b0216c42ad7a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(acroterm.sty) \
texlive-acroterm"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(splitidx.sty) \
tex(xifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
