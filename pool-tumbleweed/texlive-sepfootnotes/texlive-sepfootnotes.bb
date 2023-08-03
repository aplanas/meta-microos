SUMMARY = "Support footnotes and endnotes from separate files"
DESCRIPTION = "The package supports footnotes and endnotes from separate \
files. This is achieved with commands \\sepfootnotecontent and \
\\sepfootnote; the former defines the content of a note, while \
the latter typesets that note."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3csvn41732"

RPM_NAME = "texlive-sepfootnotes-2023.209.0.0.3csvn41732-54.1.noarch.rpm"
RPM_HASH = "3cb5049d8ba84a786ba63bfea75814e5d9b70881e50e1dbff97421252c4ad779cf49b793c205f202286d9b160d902e187e029482aec7f5c599a2332dd9f067c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sepfootnotes.sty \
texlive-sepfootnotes"

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
