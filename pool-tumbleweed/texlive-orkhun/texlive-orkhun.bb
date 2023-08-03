SUMMARY = "A font for orkhun script"
DESCRIPTION = "The font covers an old Turkic script. It is provided as \
Metafont source."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-orkhun-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "02c38ca574c69070daaaa5b3ef104b8deb5c59e75577c7884ac1e74d034227ce0f860cd62f5cda5611de2997fd5cfc3b38864ce9895e7c855e9aa9323634d3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-orhant11.tfm \
tex-orhant14.tfm \
tex-orhant16.tfm \
tex-orhant20.tfm \
tex-orhant25.tfm \
texlive-orkhun"

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
