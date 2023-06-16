SUMMARY = "Formatting based on Turabian's Manual"
DESCRIPTION = "The turabian-formatting package provides Chicago-style \
formatting based on Kate L. Turabian's 'A Manual for Writers of \
Research Papers, Theses, and Dissertations: Chicago Style for \
Students and Researchers' (9th edition)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58561"

RPM_NAME = "texlive-turabian-formatting-2023.201.svn58561-52.1.noarch.rpm"
RPM_HASH = "f2cd35feea055e3e4b32febbb5e899ac091488b452afbdbfeba2969e4748b263017b7e3e9b0a90836bfa79f876c26eb04ac4e6c9723f789087771ef725c9daa9"
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
