SUMMARY = "Place footnotes at the end"
DESCRIPTION = "Accumulates notes (using the \\endnote command, which can be \
used as a replacement for \\footnote), and places them at the \
end of the section, chapter or document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53319"

RPM_NAME = "texlive-endnotes-2023.201.svn53319-53.2.noarch.rpm"
RPM_HASH = "dac0de84956d9eeca69727e6e112c79c4a261791bc6d842b67623e565f7dae81a0958b484c249390f72d975bd91301782de5533577d1f96f5acbd8ef579219b7"
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
