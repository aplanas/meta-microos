SUMMARY = "A LaTeX document class for the Journal of Electrical Bioimpedance"
DESCRIPTION = "A document class for writing articles to the Journal of \
Electrical Bioimpedance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21758"

RPM_NAME = "texlive-elbioimp-2023.201.1.2svn21758-53.2.noarch.rpm"
RPM_HASH = "4a14a3edef0af80b5e954ce290a629a69f461b646c110e448c35c254db613c2f8e917d5cc0facce8661896662ce67438739ae98caddb35c229d59afb211f6f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elbioimp.cls \
texlive-elbioimp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
tex-mathptmx.sty \
tex-type1cm.sty \
tex-type1ec.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
