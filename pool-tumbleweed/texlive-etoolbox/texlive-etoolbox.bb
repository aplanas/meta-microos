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

PV = "2023.209.2.5ksvn56554"

RPM_NAME = "texlive-etoolbox-2023.209.2.5ksvn56554-53.1.noarch.rpm"
RPM_HASH = "f6a8161149fea6804420faab3e2fe9c582fdf8583f9aa1e023c52a3265b6c61f82b89cb8975a8e603627022a94c968e2565c54757e40d64dc0ed74cf866223e0"
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
