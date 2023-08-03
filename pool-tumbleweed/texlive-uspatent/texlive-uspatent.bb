SUMMARY = "U.S. Patent Application Tools for LaTeX and LyX"
DESCRIPTION = "The package provides a class and other tools for developing a \
beautifully formatted, consistent U.S. Patent Application using \
LaTeX and/or LyX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn27744"

RPM_NAME = "texlive-uspatent-2023.209.1.0svn27744-54.1.noarch.rpm"
RPM_HASH = "d62061baba9452fd6b725b478a346fd3bc027ab47d8eee755aa9adcc9c3a68268a3b0ac05d92b850caf30a42ae13833a06157544e543bf04eaed7772698a6927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uspatent.cls \
texlive-uspatent"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acronym.sty \
tex-amsmath.sty \
tex-babel.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-lmodern.sty \
tex-memhfixc.sty \
tex-memoir.cls \
tex-prettyref.sty \
tex-tikz.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
