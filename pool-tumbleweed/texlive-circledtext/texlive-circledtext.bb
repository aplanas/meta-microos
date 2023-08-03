SUMMARY = "Create circled text"
DESCRIPTION = "This LaTeX package provides a macro \\circledtext to typeset \
circled text. Its starred version can produce an inverted \
version."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn63166"

RPM_NAME = "texlive-circledtext-2023.209.1.1.0svn63166-54.1.noarch.rpm"
RPM_HASH = "e26f1a6f7c0111d4ef98c6bf3372c929614949677a8a2ed51eb86392c05bf73f7298165255b69b7e1139a6635329830634c1b298b629df7d6ca7eb86696b5e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-circledtext.sty \
texlive-circledtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3draw.sty \
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
