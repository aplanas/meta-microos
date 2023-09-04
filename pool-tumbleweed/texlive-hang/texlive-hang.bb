SUMMARY = "Environments for hanging paragraphs and list items"
DESCRIPTION = "This package provides environments for hanging paragraphs and \
list items. In addition, it defines environments for labeled \
paragraphs and list items."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn43280"

RPM_NAME = "texlive-hang-2023.209.2.1svn43280-54.2.noarch.rpm"
RPM_HASH = "1d88092124e8d4d5bf7fecf50768aad99492959a34f794f396b2c5e429631034a211a7f0576f90bdecc33bafe37b430c516b862a5bd912c607746af573b75e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hang.sty \
texlive-hang"

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
