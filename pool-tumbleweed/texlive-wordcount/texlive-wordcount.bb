SUMMARY = "Estimate the number of words in a LaTeX document"
DESCRIPTION = "The package provides a relatively easy way of estimating the \
number of words in a LaTeX document that does not require \
dvitty or other DVI converters. It does however require \
something like Unix grep -c that can search a file for a \
particular string and report the number of matching lines. An \
accompanying shell script wordcount.sh contains more \
information in its comments."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn46165"

RPM_NAME = "texlive-wordcount-2023.209.1.7svn46165-54.1.noarch.rpm"
RPM_HASH = "577d411dfafe4c176d0935a712e87e54978d63e56e0fcbbbb22330e7f44667fb6585afe60b778c4114b1b92f1758bb6372e9a472efd07c3a790da01d827943e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wordcount.tex \
texlive-wordcount"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-wordcount-bin"

inherit rpm
