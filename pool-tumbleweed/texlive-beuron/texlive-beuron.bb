SUMMARY = "The script of the Beuronese art school"
DESCRIPTION = "This package provides the script used in the works of the \
Beuron art school for use with TeX and LaTeX. It is a \
monumental script consisting of capital letters only. The fonts \
are provided as Metafont sources, in the Type1 and in the \
OpenType format. The package includes suitable font selection \
commands for use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn46374"

RPM_NAME = "texlive-beuron-2023.201.1.3svn46374-53.1.noarch.rpm"
RPM_HASH = "dd0089cd3930f95d4bf6571d57f1d2b9d98be686cb298601eceba7c530aaceb57ea4f042e720ca9d567ae9d1bc29eeb8c86000fe919264ee2f2bb1fad03badf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beuron.map \
tex-beuron.sty \
tex-beuron.tfm \
tex-beuronc.tfm \
tex-beuronx.tfm \
tex-t1beuron.fd \
texlive-beuron"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fontspec.sty \
tex-updmap.cfg \
tex-xparse.sty \
texlive \
texlive-beuron-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
