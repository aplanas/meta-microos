SUMMARY = "Boxes with crossed corners"
DESCRIPTION = "The package implements a \\crbox command which produces boxes \
with crossing lines at the corners."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.1svn29803"

RPM_NAME = "texlive-crbox-2023.204.0.0.1svn29803-54.1.noarch.rpm"
RPM_HASH = "45c225f68af14bbeef5db011ba05ee7eb6f4dbca327961d91a8ec89fe0f40e35ab7d1a640b5ecd8dbf4351e0d00abe4350fec39c73507a704deed803e305860f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crbox.sty \
texlive-crbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
