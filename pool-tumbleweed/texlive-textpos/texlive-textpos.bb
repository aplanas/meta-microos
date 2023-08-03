SUMMARY = "Place boxes at arbitrary positions on the LaTeX page"
DESCRIPTION = "A package to facilitate placement of boxes at absolute \
positions on the LaTeX page. There are several reasons why this \
might be useful, an important one being to help the creation of \
large-format conference posters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10.1svn63967"

RPM_NAME = "texlive-textpos-2023.209.1.10.1svn63967-55.1.noarch.rpm"
RPM_HASH = "60590b81b2c6ff1edc34079edaa9349dfea11def8b76aef5712ca651b2171b15021806a1324f026ce9b5957b967dbc6aed27d750c1a6f790d66e49d9d93233d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textpos.sty \
texlive-textpos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
