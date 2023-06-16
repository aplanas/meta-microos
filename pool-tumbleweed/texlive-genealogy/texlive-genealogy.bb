SUMMARY = "A compilation genealogy font"
DESCRIPTION = "A simple compilation of the genealogical symbols found in the \
wasy and gen fonts, adding the male and female symbols to \
Knuth's 'gen' font, and so avoiding loading two fonts when you \
need only genealogical symbols. The font is distributed as \
Metafont source."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25112"

RPM_NAME = "texlive-genealogy-2023.201.svn25112-52.1.noarch.rpm"
RPM_HASH = "b6ec820c90ae4ffe0295145dbc29f9b27df839820ea59cb4501886e5653d45f5994de08133295b4f332a2098a3cc25badab2aa7fd93235af6cff98ac09d9235d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drgen10.tfm \
texlive-genealogy"

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
