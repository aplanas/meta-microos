SUMMARY = "Use AMS Euler fonts for math"
DESCRIPTION = "Provides a setup for using the AMS Euler family of fonts for \
mathematics in LaTeX documents. 'The underlying philosophy of \
Zapf's Euler design was to capture the flavour of mathematics \
as it might be written by a mathematician with excellent \
handwriting.' The euler package is based on Knuth's macros for \
the book 'Concrete Mathematics'. The text fonts for the \
Concrete book are supported by the beton package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5svn42428"

RPM_NAME = "texlive-euler-2023.209.2.5svn42428-53.1.noarch.rpm"
RPM_HASH = "efa8ac68d58c96b6ebe9387187ad89a2bd5083dec2d04077ca8fd566297f4786d9f054816a7a9033966c8144257cc8b2b655734f9822e2fc15c6934408bd4f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euler.sty \
texlive-euler"

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
