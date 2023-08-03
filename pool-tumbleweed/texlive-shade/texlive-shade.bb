SUMMARY = "Shade pieces of text"
DESCRIPTION = "The package provides a shaded backdrop to a box of text. It \
uses a Metafont font (provided) which generates to appropriate \
shading dependent on the resolution used in the Metafont \
printer parameters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn22212"

RPM_NAME = "texlive-shade-2023.209.1svn22212-54.1.noarch.rpm"
RPM_HASH = "082ca97eb7dbefccb7b91eb7642ab0994c80b1acd4fe76fc75b4a7fa7434db1068f5b3b98ccd969258cfb80f1abaa40e0368c1d8ea8f5e4c9a1d88d336763f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shade.tex \
texlive-shade"

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
