SUMMARY = "Use Pygments to format code listings in documents"
DESCRIPTION = "PygmenTeX is a Python-based LaTeX package that can be used for \
typesetting code listings in a LaTeX document using Pygments. \
Pygments is a generic syntax highlighter for general use in all \
kinds of software such as forum systems, wikis or other \
applications that need to prettify source code."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-2023.201.0.0.11svn64131-53.2.noarch.rpm"
RPM_HASH = "d125203c83bb55443281c490c25371b26712c66d483957e1d6602262e2e23d5ac1dcea3045409b57207d36458969b053b3ff41d2e09ba3d6e8cf02cf4516d7f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pygmentex.sty \
texlive-pygmentex"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-color.sty \
tex-efbox.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-mdframed.sty \
tex-pgfkeys.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pygmentex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
