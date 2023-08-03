SUMMARY = "Air Force Institute of Technology thesis class"
DESCRIPTION = "LaTeX thesis/dissertation class for US Air Force Institute Of \
Technology."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.7svn15878"

RPM_NAME = "texlive-afthesis-2023.209.2.7svn15878-55.1.noarch.rpm"
RPM_HASH = "f970b86489a5ef0ad89afeb5b19d476d27f488d96e80f21284fc9d7449405622fa8e896e1281103e1bfc75affd5d01843cf744878ee126b5197058c8a610ac1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afthes10.sty \
tex-afthes11.sty \
tex-afthes12.sty \
tex-afthesis.cls \
tex-afthesis.sty \
texlive-afthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption2.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
