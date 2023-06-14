SUMMARY = "Support footnotes and endnotes from separate files"
DESCRIPTION = "The package supports footnotes and endnotes from separate \
files. This is achieved with commands \\sepfootnotecontent and \
\\sepfootnote; the former defines the content of a note, while \
the latter typesets that note."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3csvn41732"

RPM_NAME = "texlive-sepfootnotes-2023.201.0.0.3csvn41732-53.1.noarch.rpm"
RPM_HASH = "7348b5d3d4d01948cbe092e744c0868dc60ae11bac065623590aab50dfb3da457641c25d6a116c5adc89d2e1abb5e0b333959a380703d99fbe0d4e8c8510466a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sepfootnotes.sty \
texlive-sepfootnotes"

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
