SUMMARY = "Typeset Frege's Grundgesetze der Arithmetik"
DESCRIPTION = "The package defines maths mode commands for typesetting Gottlob \
Frege's concept-script in the style of his 'Grundgesetze der \
Arithmetik' (Basic Laws of Arithmetic)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-2023.201.1.03svn58997-53.1.noarch.rpm"
RPM_HASH = "7f9e8fc78ba2cc6ea38b0cea9b9c695c6b7f7660ff5cd40f6f1dffb3cf560deabd4d6df56c797e463a132a60995b55ac6e9c5bba4559308f3df2ae74aad58a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(grundgesetze.sty) \
texlive-grundgesetze"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(bguq.sty) \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
