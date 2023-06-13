SUMMARY = "Extra commands for bussproofs.sty"
DESCRIPTION = "This package provides additional functionality for \
bussproofs.sty; specifically, it allows for typesetting of \
entire (sub)deductions."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn51299"

RPM_NAME = "texlive-bussproofs-extra-2023.201.0.0.4svn51299-52.1.noarch.rpm"
RPM_HASH = "91e2f9b0d8b60431f7c79d39bd36c886136e2cb2e223696d1f650cf6ed5e8fcdcd989e68bdcd38d25db217d8a13fe2a318d1649d9074a6ca41a9c5058e4c015f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bussproofs-extra.sty) \
texlive-bussproofs-extra"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(bussproofs.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
