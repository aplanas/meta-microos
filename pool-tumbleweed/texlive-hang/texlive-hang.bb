SUMMARY = "Environments for hanging paragraphs and list items"
DESCRIPTION = "This package provides environments for hanging paragraphs and \
list items. In addition, it defines environments for labeled \
paragraphs and list items."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn43280"

RPM_NAME = "texlive-hang-2023.201.2.1svn43280-53.1.noarch.rpm"
RPM_HASH = "7826e59c2d592df1f412adda762f5504752b0d68cb3e637a003dbf9c2a5ed9f665f3955898fbf4a6b28fb04579aa18485c4a519ba59afaabec45ba1b1dbfcb86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hang.sty \
texlive-hang"

RDEPENDS:${PN} += "/bin/sh \
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
