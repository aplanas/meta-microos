SUMMARY = "Typeset Frege's Grundgesetze der Arithmetik"
DESCRIPTION = "The package defines maths mode commands for typesetting Gottlob \
Frege's concept-script in the style of his 'Grundgesetze der \
Arithmetik' (Basic Laws of Arithmetic)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-2023.209.1.03svn58997-54.1.noarch.rpm"
RPM_HASH = "1f21fd721c2bbb827fffa5fc4ff221eec8f469237bc9e62e3b333675e3a0709086f738451b711398ae3584694a07bc121f9d5435848a5e768d9b18407e815a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grundgesetze.sty \
texlive-grundgesetze"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bguq.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
