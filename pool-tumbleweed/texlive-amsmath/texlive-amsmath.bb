SUMMARY = "AMS mathematical facilities for LaTeX"
DESCRIPTION = "The package provides the principal packages in the AMS-LaTeX \
distribution. It adapts for use in LaTeX most of the \
mathematical features found in AMS-TeX; it is highly \
recommended as an adjunct to serious mathematical typesetting \
in LaTeX. When amsmath is loaded, AMS-LaTeX packages amsbsy \
(for bold symbols), amsopn (for operator names) and amstext \
(for text embedded in mathematics) are also loaded. amsmath is \
part of the LaTeX required distribution; however, several \
contributed packages add still further to its appeal; examples \
are empheq, which provides functions for decorating and \
highlighting mathematics, and ntheorem, for specifying theorem \
(and similar) definitions."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63514"

RPM_NAME = "texlive-amsmath-2023.209.svn63514-55.1.noarch.rpm"
RPM_HASH = "70fd41ecc98d36284034129bbc40e628db7025b6a0097031e1e2ca9c0b75c718caa8afd2240f834b91565efcb069ffbbe21330737a0450b953e6a59b5df9a8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amsbsy.sty \
tex-amscd.sty \
tex-amsgen.sty \
tex-amsmath-2018-12-01.sty \
tex-amsmath.sty \
tex-amsopn.sty \
tex-amstex.sty \
tex-amstext.sty \
tex-amsxtra.sty \
texlive-amsmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
