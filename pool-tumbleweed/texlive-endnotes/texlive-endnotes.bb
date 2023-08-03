SUMMARY = "Place footnotes at the end"
DESCRIPTION = "Accumulates notes (using the \\endnote command, which can be \
used as a replacement for \\footnote), and places them at the \
end of the section, chapter or document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53319"

RPM_NAME = "texlive-endnotes-2023.209.svn53319-54.1.noarch.rpm"
RPM_HASH = "af3080b620c897da835645939c0cd7b43ca417be961c4fddf6235e03380797700878b49d91c7d96a024cde3ac4556ae5ec0ab99443a1fa6895d90800a22b2990"
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
