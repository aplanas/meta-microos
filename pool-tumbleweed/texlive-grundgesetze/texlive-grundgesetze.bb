SUMMARY = "Typeset Frege's Grundgesetze der Arithmetik"
DESCRIPTION = "The package defines maths mode commands for typesetting Gottlob \
Frege's concept-script in the style of his 'Grundgesetze der \
Arithmetik' (Basic Laws of Arithmetic)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-2023.209.1.03svn58997-54.2.noarch.rpm"
RPM_HASH = "0dea2ebb2aa9b6659282239642821ad94e65d82382af2cba8c13ec574d08a674221cf30eda035f1b7b4008d4dd235cd094de5023544e49773a0417b8ff6bab49"
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
