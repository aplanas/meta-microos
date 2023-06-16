SUMMARY = "Flexible cross-references with contextual checks based on zref"
DESCRIPTION = "This package provides an user interface for making LaTeX \
cross-references flexibly, while allowing to have them checked \
for consistency with the document structure as typeset. \
Statements such as 'above', 'on the next page', 'previously', \
'as will be discussed', 'on the previous chapter' and so on can \
be given to \\zcheck in free-form, and a set of 'checks' can be \
specified to be run against a given 'label', which will result \
in a warning at compilation time if any of these checks fail. \
\\zctarget and the zcregion environment are also defined as a \
means to easily set label targets to arbitrary places in the \
text which can be referred to by \\zcheck."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn63845"

RPM_NAME = "texlive-zref-check-2023.201.0.0.3.2svn63845-52.1.noarch.rpm"
RPM_HASH = "be4a9b92d7ab7a51052cc44f2165a23af3bed0679cb3b3f4a844a8b6c2344860e062a2dcb849c487089692ab7cf7c5f056edc9a3264396cd40bcdfba549c7086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zref-check.sty \
texlive-zref-check"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifdraft.sty \
tex-zref-abspage.sty \
tex-zref-hyperref.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
