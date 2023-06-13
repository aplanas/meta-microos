SUMMARY = "Use AMS Euler fonts for math"
DESCRIPTION = "Provides a setup for using the AMS Euler family of fonts for \
mathematics in LaTeX documents. 'The underlying philosophy of \
Zapf's Euler design was to capture the flavour of mathematics \
as it might be written by a mathematician with excellent \
handwriting.' The euler package is based on Knuth's macros for \
the book 'Concrete Mathematics'. The text fonts for the \
Concrete book are supported by the beton package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5svn42428"

RPM_NAME = "texlive-euler-2023.201.2.5svn42428-52.1.noarch.rpm"
RPM_HASH = "44ae5808c2e9174822b1ef118d37b792d0dc6a1f316c9895785cafd99df7f918c9192b6c4a3735cfd30e78c46b21b66adc34421f114e33473a7c783309e80ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(euler.sty) \
texlive-euler"

RDEPENDS:${PN} += "/bin/sh \
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
