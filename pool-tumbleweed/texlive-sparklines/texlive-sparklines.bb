SUMMARY = "Drawing sparklines: intense, simple, wordlike graphics"
DESCRIPTION = "Sparklines are intense, simple, wordlike graphics (so named by \
Edward Tufte). In lieu of a more detailed introduction, \
Professor Tufte's site has an early release of a chapter on \
sparklines. A PHP implementation may be found at SourceForge. A \
sparkline can be added using the sparkline environment. Also, \
you can add sparkling rectangles for the median and special \
sparkling dots in red or blue. The package requires pdfLaTeX; \
sparklines cannot appear in a dvi file. The sparklines package \
uses pgf, and does not work with pictex."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn42821"

RPM_NAME = "texlive-sparklines-2023.209.1.7svn42821-58.1.noarch.rpm"
RPM_HASH = "fa333e5d6ef1a986abb3cd985afc435a2bf8f3b742496df22a4d7d647024af251c3d60a027f58608c506c2d2508a4c50c1c406157ed8135a96fe52aec5000f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sparklines.sty \
texlive-sparklines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
