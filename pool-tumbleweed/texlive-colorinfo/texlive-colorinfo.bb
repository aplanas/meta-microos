SUMMARY = "Retrieve colour model and values for defined colours"
DESCRIPTION = "The colorinfo package"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3csvn15878"

RPM_NAME = "texlive-colorinfo-2023.209.0.0.3csvn15878-54.1.noarch.rpm"
RPM_HASH = "f01b5ad8911a4908dff2dd0dd40efcf12b82e16e52ef2261b90290063a3fb05835b0896001c55cedeff24a9ab2076146c338c1cc84a4bd99a8979ade48e143ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorinfo.sty \
texlive-colorinfo"

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
