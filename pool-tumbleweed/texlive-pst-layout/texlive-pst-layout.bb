SUMMARY = "Page layout macros based on PSTricks packages"
DESCRIPTION = "The package provides a means of creating elaborate \
('pseudo-tabular') layouts of material, typically to be \
overlaid on an included graphic. The package requires a recent \
version of the package pst-node and some other pstricks-related \
material."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.95svn29803"

RPM_NAME = "texlive-pst-layout-2023.209.0.0.95svn29803-53.1.noarch.rpm"
RPM_HASH = "d21843dd53cda6a46eb3c9ead003a2ad83bed354a2f84e229df5bd40c801620cd630396086ead80ad2cfb3eb8c8101df06e25f51c5b07302c0f423f9fb297438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-layout.sty \
texlive-pst-layout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arrayjobx.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
