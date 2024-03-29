SUMMARY = "Support for psfrag within pdfLaTeX"
DESCRIPTION = "The package works in the same sort of way as pst-pdf, but it \
also processes the PostScript graphics with psfrag to add \
labels within the graphic, before conversion. Thus the bundle \
replaces two steps of an ordinary workflow. (Naturally, the \
package requires that \\write 18 is enabled.) Pstool ensures \
that each version of each graphic is compiled once only (the \
graphic is (re-)compiled only if it has changed since the \
previous compilation of the document). This drastically speeds \
up the running of the package in the typical case (though the \
first run of any document is inevitably just as slow as with \
any similar package)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5esvn46393"

RPM_NAME = "texlive-pstool-2023.209.1.5esvn46393-54.2.noarch.rpm"
RPM_HASH = "8d9188b6635f7728abd3a1bb9f827113adaf1802f0b983eac8927f69cdcb610fdd170319e72e7087a4d95c1e6ee060bb90057dda045ee1421a26744cdfe66564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pstool.sty \
texlive-pstool"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-preview.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
