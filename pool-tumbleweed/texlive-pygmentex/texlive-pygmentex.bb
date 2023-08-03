SUMMARY = "Use Pygments to format code listings in documents"
DESCRIPTION = "PygmenTeX is a Python-based LaTeX package that can be used for \
typesetting code listings in a LaTeX document using Pygments. \
Pygments is a generic syntax highlighter for general use in all \
kinds of software such as forum systems, wikis or other \
applications that need to prettify source code."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-2023.209.0.0.11svn64131-54.1.noarch.rpm"
RPM_HASH = "ebd5f89963490fe1dcd844ea857f49218d10dc16921cc5638ce890c8a01d74f5350c168970fba6a83c829fd5e375e912a5d75def1d934f9e28172c22e785017a"
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
