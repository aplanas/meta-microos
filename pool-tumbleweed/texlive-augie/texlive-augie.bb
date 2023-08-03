SUMMARY = "Calligraphic font for typesetting handwriting"
DESCRIPTION = "A calligraphic font for simulating American-style informal \
handwriting. The font is distributed in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-augie-2023.209.svn61719-54.1.noarch.rpm"
RPM_HASH = "6ca9545f7f615c35342fe6473f01be0392639bdcf4f378c978dc343cdb8f73897c504adf5df760431c893859ffce182215db1354f9480d4f114b171e6e570b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-augie---.tfm \
tex-augie.map \
tex-augie7t.tfm \
tex-augie7t.vf \
tex-augie8c.tfm \
tex-augie8c.vf \
tex-augie8r.tfm \
tex-augie8t.tfm \
tex-augie8t.vf \
tex-ot1augie.fd \
tex-t1augie.fd \
tex-ts1augie.fd \
texlive-augie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-augie-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
