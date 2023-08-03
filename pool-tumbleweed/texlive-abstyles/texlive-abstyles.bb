SUMMARY = "Adaptable BibTeX styles"
DESCRIPTION = "A family of modifications of the standard BibTeX styles whose \
behaviour may be changed by changing the user document, without \
change to the styles themselves. The package is largely used \
nowadays in its adaptation for working with Babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-abstyles-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "3efcf1b4603a6f3780a9dd4520f853bf6f34f6d3952d26815526e29deed8c5a38c8bd6b0022a589142377a760cc150567739078fb8d591ee999a9e84b9447037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apreambl.tex \
texlive-abstyles"

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
