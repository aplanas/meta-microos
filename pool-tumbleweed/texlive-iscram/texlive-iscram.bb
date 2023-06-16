SUMMARY = "A LaTeX class to publish article to ISCRAM conferences"
DESCRIPTION = "LaTeX class to publish article to ISCRAM (International \
Conference on Information Systems for Crisis Response and \
Management)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn45801"

RPM_NAME = "texlive-iscram-2023.201.1.1svn45801-55.1.noarch.rpm"
RPM_HASH = "cfee0b9c6c4eef79676b20f6a7897238c3ec64e1e64692053cc08a8e32259c0ba43835fb5776649c87bd6ca8bfa45b70952cd477901f8437d5ded9e1b1da4f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iscram.cls \
texlive-iscram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-nowidow.sty \
tex-pgfopts.sty \
tex-titlesec.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
