SUMMARY = "Typeset Frege's Grundgesetze der Arithmetik"
DESCRIPTION = "The package defines maths mode commands for typesetting Gottlob \
Frege's concept-script in the style of his 'Grundgesetze der \
Arithmetik' (Basic Laws of Arithmetic)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-2023.201.1.03svn58997-53.2.noarch.rpm"
RPM_HASH = "138e756032cf55ffd4613987820a8e24bf91b692c4ef5605784a9b125db7c22a6e51a0403344a9184c5cc601d6f4f91fa5b1bb9e78b3960c16a412279227cd29"
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
