SUMMARY = "Easy creation of potential energy curve diagrams"
DESCRIPTION = "The package provides the facility of drawing potential energy \
curve diagrams with just a few simple commands. The package \
cannot (yet) be considered stable."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1dsvn34486"

RPM_NAME = "texlive-endiagram-2023.201.0.0.1dsvn34486-53.1.noarch.rpm"
RPM_HASH = "7e268c4721f1df853bf683580b1b88b839eacb125ad3be6d9ce0a3a5088a883e0e1098177ef689cf07eb8d360b8fc5670e1d89b37b92afa1c3816dff36421dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(endiagram.sty) \
texlive-endiagram"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(siunitx.sty) \
tex(tikz.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
