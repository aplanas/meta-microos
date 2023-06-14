SUMMARY = "Calligraphic font for typesetting handwriting"
DESCRIPTION = "A calligraphic font for simulating American-style informal \
handwriting. The font is distributed in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-augie-2023.201.svn61719-53.1.noarch.rpm"
RPM_HASH = "df56be971ba67a3997d0d676da572b9b55c9e635563cfe3b869cc6ccd1c4675db4c918882aecea39b7fa8cba3f7cb5cd12b6c3d65c6c66cff718206bf7a7383e"
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

RDEPENDS:${PN} += "/bin/sh \
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
