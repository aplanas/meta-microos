SUMMARY = "A LaTeX companion to the 'texsurgery' python project"
DESCRIPTION = "This LaTeX library is a companion to the texsurgery python \
project. It will make sure that 'pdflatex document.tex' will \
work, with reasonable defaults, for a document that is intended \
to work with texsurgery, and also has other uses, always in \
tandem with the texsurgery pypi package."
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.6.0svn59885"

RPM_NAME = "texlive-texsurgery-2023.209.0.0.6.0svn59885-55.1.noarch.rpm"
RPM_HASH = "04cda25777a40837199c9ed0e8eab9cded571101617801a9925e840a273838845bc1a26393f3e9be026e6dd3e7a883e7f577e54f99bd9e4691ebf164889458ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texsurgery.sty \
texlive-texsurgery"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
