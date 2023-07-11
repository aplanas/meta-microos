SUMMARY = "Table package extensions"
DESCRIPTION = "Modifies the tabularx environment to combine the features of \
the tabularx package (auto-sized columns in a fixed width \
table) with those of the longtable package (multi-page tables)."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn34923"

RPM_NAME = "texlive-ltablex-2023.208.1.1svn34923-53.1.noarch.rpm"
RPM_HASH = "dc5f13ee4a19fb1ebe452657feead09a43878d040ace2eb8a636fa894540710d6bf8a9a5143a10ac0429e5262cb1e008e042140990629e6aeafb2c1d3c95f7b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltablex.sty \
texlive-ltablex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-longtable.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
