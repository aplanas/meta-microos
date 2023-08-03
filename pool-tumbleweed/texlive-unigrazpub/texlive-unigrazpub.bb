SUMMARY = "LaTeX templates for University of Graz Library Publishing Services"
DESCRIPTION = "This package provides a LaTeX class matching the preparation \
guidelines of the Library Publishing Services of University of \
Graz. The bundle also includes a comprehensive set of example \
files for books and collections."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn64797"

RPM_NAME = "texlive-unigrazpub-2023.209.1.00svn64797-54.1.noarch.rpm"
RPM_HASH = "068cb239fd42a97d022a0ba48262591542c4320133a93c0283740d2c5780b4819656ac892c467d21ece15d52ea692fb5859ef0f6b4dff0219ab41914b19d5f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unigrazpub.cls \
texlive-unigrazpub"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-biblatex-chicago.sty \
tex-csquotes.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-l3keys2e.sty \
tex-ragged2e.sty \
tex-roboto.sty \
tex-scrbook.cls \
tex-scrlayer-scrpage.sty \
tex-sourceserifpro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
