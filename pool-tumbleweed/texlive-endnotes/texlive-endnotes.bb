SUMMARY = "Place footnotes at the end"
DESCRIPTION = "Accumulates notes (using the \\endnote command, which can be \
used as a replacement for \\footnote), and places them at the \
end of the section, chapter or document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53319"

RPM_NAME = "texlive-endnotes-2023.201.svn53319-53.1.noarch.rpm"
RPM_HASH = "d2158cf06b83564af9ebba9d32cb8029d845c34e92c0298515cf9066e4e84b4ab4fb7bfd94cc9630dad96894b8c6e70f64e65444ef62401e42f35f45d4e48398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endnotes.sty \
texlive-endnotes"

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
