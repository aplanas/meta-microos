SUMMARY = "Selectively include/exclude portions of text"
DESCRIPTION = "Selectively include/exclude pieces of text, allowing the user \
to define new, separately controlled, comment versions. All \
text between \\comment ... \\endcomment or \\begin{comment} ... \
\\end{comment} is discarded. The opening and closing commands \
should appear on a line of their own. No starting spaces, \
nothing after it. This environment should work with arbitrary \
amounts of comment, and the comment can be arbitrary text. \
Other 'comment' environments are defined and \
selected/deselected with \\includecomment{versiona} and \
\\excludecoment{versionb} These environments are used as \
\\versiona ... \\endversiona or \\begin{versiona} ... \
\\end{versiona} with the opening and closing commands again on a \
line of their own."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.8svn41927"

RPM_NAME = "texlive-comment-2023.209.3.8svn41927-54.1.noarch.rpm"
RPM_HASH = "13f9752dbe907a964b7c16b1d884a4e2bc1798678f4a0016810a0e2a2a704406530c642e909d36d7aa4b73210cd973a59241da69eea167495b188f4abe55644d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-comment.sty \
texlive-comment"

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
texlive-scripts-bin"

inherit rpm
