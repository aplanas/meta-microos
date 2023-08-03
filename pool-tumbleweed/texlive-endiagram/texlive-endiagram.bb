SUMMARY = "Easy creation of potential energy curve diagrams"
DESCRIPTION = "The package provides the facility of drawing potential energy \
curve diagrams with just a few simple commands. The package \
cannot (yet) be considered stable."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1dsvn34486"

RPM_NAME = "texlive-endiagram-2023.209.0.0.1dsvn34486-54.1.noarch.rpm"
RPM_HASH = "dc0fe46ef3fc230a0deb741a79d9a6cbe48a7b65fd5d65411de3529a0c34b4f9ff4c0bcca922ba8700809bd030062772990177d4ed8d69c81d082d778738b102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endiagram.sty \
texlive-endiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
