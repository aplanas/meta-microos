SUMMARY = "Use Lambda expression within LaTeX"
DESCRIPTION = "This package provides Lambda expressions. It is an interface to \
specify the parameters and replacement code of a \
document-command, and then to evaluate it with compatible \
arguments. Optionally, it can be used recursively."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn60278"

RPM_NAME = "texlive-lambdax-2023.209.1.1svn60278-56.1.noarch.rpm"
RPM_HASH = "60c6243ea35fcdae5a782628754f24153b2a299407d45d08fa95cd142a8112916ca3e67c6e7f8e9c55899a6dfca4d6f7b20af1fbe0a8424865fdecef73ed02e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lambdax.sty \
texlive-lambdax"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-keyparse.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
