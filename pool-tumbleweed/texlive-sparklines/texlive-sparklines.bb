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

PV = "2023.201.1.7svn42821"

RPM_NAME = "texlive-sparklines-2023.201.1.7svn42821-57.1.noarch.rpm"
RPM_HASH = "d616ca7b77eed2892d47b04e95ad51d23f27b6fc9de1bdc6b827e888672197e661a1f8bfdf29d9c92119e9964ba38825e1acdf5a70f208713b1b3f8729ccd612"
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
