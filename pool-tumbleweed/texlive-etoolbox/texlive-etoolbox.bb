SUMMARY = "E-TeX tools for LaTeX"
DESCRIPTION = "The package is a toolbox of programming facilities geared \
primarily towards LaTeX class and package authors. It provides \
LaTeX frontends to some of the new primitives provided by e-TeX \
as well as some generic tools which are not strictly related to \
e-TeX but match the profile of this package. Note that the \
initial versions of this package were released under the name \
elatex. The package provides functions that seem to offer \
alternative ways of implementing some LaTeX kernel commands; \
nevertheless, the package will not modify any part of the LaTeX \
kernel."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5ksvn56554"

RPM_NAME = "texlive-etoolbox-2023.201.2.5ksvn56554-52.1.noarch.rpm"
RPM_HASH = "f365390109a91c6d0e47a824244af7ed427a34bf4f08b64193ab731226257f524c94ded44266884365b2b88bb6e9a18da9534986fee600e42453f61cba90b0a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etoolbox.def \
tex-etoolbox.sty \
texlive-etoolbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
