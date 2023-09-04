SUMMARY = "Use Pygments to format code listings in documents"
DESCRIPTION = "PygmenTeX is a Python-based LaTeX package that can be used for \
typesetting code listings in a LaTeX document using Pygments. \
Pygments is a generic syntax highlighter for general use in all \
kinds of software such as forum systems, wikis or other \
applications that need to prettify source code."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-2023.209.0.0.11svn64131-54.2.noarch.rpm"
RPM_HASH = "b17bdbfdc0cdba1d5df0521241240986eacca68f9f568097029633a99b73797e1d6e409d235019e17b39102d2a46e6951095e958ea47fd7fd071ece5d1eeaac8"
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
