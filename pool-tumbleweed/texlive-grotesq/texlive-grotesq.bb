SUMMARY = "URW Grotesq font pack for LaTeX"
DESCRIPTION = "The directory contains a copy of the Type 1 font 'URW Grotesq \
2031 Bold' released under the GPL by URW, with supporting files \
for use with (La)TeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn35859"

RPM_NAME = "texlive-grotesq-2023.209.svn35859-54.2.noarch.rpm"
RPM_HASH = "1e64c5ea71f8c5f1c0431ef631eb668a3bc893d08aa05b5b6ff7c72684a37792ef8dbf68623ac1ad43f02c938e0bf77099dfc8f875aed7a0221f46588a548f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1ugq.fd \
tex-t1ugq.fd \
tex-ts1ugq.fd \
tex-ugq.map \
tex-ugqb7t.tfm \
tex-ugqb7t.vf \
tex-ugqb8a.tfm \
tex-ugqb8c.tfm \
tex-ugqb8c.vf \
tex-ugqb8r.tfm \
tex-ugqb8t.tfm \
tex-ugqb8t.vf \
tex-ugqbo7t.tfm \
tex-ugqbo7t.vf \
tex-ugqbo8c.tfm \
tex-ugqbo8c.vf \
tex-ugqbo8r.tfm \
tex-ugqbo8t.tfm \
tex-ugqbo8t.vf \
texlive-grotesq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-grotesq-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
