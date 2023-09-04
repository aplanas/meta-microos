SUMMARY = "Place footnotes at the end"
DESCRIPTION = "Accumulates notes (using the \\endnote command, which can be \
used as a replacement for \\footnote), and places them at the \
end of the section, chapter or document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53319"

RPM_NAME = "texlive-endnotes-2023.209.svn53319-54.2.noarch.rpm"
RPM_HASH = "84201e265cea438f2bc8fd66c51fee76356f0ee24ec401f06d1f08ef2c0731c85b12a699f0ec5ebc66d9a5e8f37b079073d2a1f7f54f280d72ab98accdfc284c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endnotes.sty \
texlive-endnotes"

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
