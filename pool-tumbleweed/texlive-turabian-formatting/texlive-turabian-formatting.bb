SUMMARY = "Formatting based on Turabian's Manual"
DESCRIPTION = "The turabian-formatting package provides Chicago-style \
formatting based on Kate L. Turabian's 'A Manual for Writers of \
Research Papers, Theses, and Dissertations: Chicago Style for \
Students and Researchers' (9th edition)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58561"

RPM_NAME = "texlive-turabian-formatting-2023.209.svn58561-53.1.noarch.rpm"
RPM_HASH = "f0ac998a147c88659822bf4b80ba76b77a754af87fb9112d8b39235711e0a09d24dcb35b318f31aa093665bbcaadbbde8cea967c834571ccd7c82fa56b9770b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turabian-formatting.sty \
tex-turabian-researchpaper.cls \
tex-turabian-thesis.cls \
texlive-turabian-formatting"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-book.cls \
tex-endnotes.sty \
tex-etoolbox.sty \
tex-footmisc.sty \
tex-nowidow.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
