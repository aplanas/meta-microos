SUMMARY = "Macros and fonts for creating Feynman (and other) diagrams"
DESCRIPTION = "The feynmf package provides an interface to Metafont (inspired \
by the facilities of mfpic) to use simple structure \
specifications to produce relatively complex diagrams. (The \
feynmp package, also part of this bundle, uses MetaPost in the \
same way.) While the package was designed for Feynman diagrams, \
it could in principle be used for diagrams in graph and similar \
theories, where the structure is semi-algorithmically \
determined."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.08svn17259"

RPM_NAME = "texlive-feynmf-2023.209.1.08svn17259-53.1.noarch.rpm"
RPM_HASH = "ca60c6ece14261b22f874b4e675e47e126bfa52f9cd1af8c84c79f856226b9191b1193261762476929e2e9deb97547d656876d5cc231c13511a2ab04a14989c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-feynmf.sty \
tex-feynmp.sty \
texlive-feynmf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
