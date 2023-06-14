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

PV = "2023.201.3.8svn41927"

RPM_NAME = "texlive-comment-2023.201.3.8svn41927-53.1.noarch.rpm"
RPM_HASH = "7f62978d24406d523f099a4908747451940e7d73b7915e2ace15d6d50a44828f8baae8af3da52d167b7b03b166f8411a3b2551ef03828e8392ff1f006782b6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-comment.sty \
texlive-comment"

RDEPENDS:${PN} += "/bin/sh \
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
