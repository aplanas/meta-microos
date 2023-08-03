SUMMARY = "Thesis class complying with Marquette University Graduate School requirements"
DESCRIPTION = "The bundle offers a thesis class, based on memoir, that \
complies with Marquette University Graduate School \
requirements."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64259"

RPM_NAME = "texlive-mugsthesis-2023.209.1.1svn64259-55.1.noarch.rpm"
RPM_HASH = "f58c83c32b721dd427b3d7fb058e0ca87d41b0458e01f75c560c1fab34e903584a9ad760a2cda93b7d674a168a11da5656ef291ede50a050f2e762fae45e6f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mugsthesis.cls \
texlive-mugsthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-indentfirst.sty \
tex-memoir.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
