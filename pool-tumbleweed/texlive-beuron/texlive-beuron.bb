SUMMARY = "The script of the Beuronese art school"
DESCRIPTION = "This package provides the script used in the works of the \
Beuron art school for use with TeX and LaTeX. It is a \
monumental script consisting of capital letters only. The fonts \
are provided as Metafont sources, in the Type1 and in the \
OpenType format. The package includes suitable font selection \
commands for use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn46374"

RPM_NAME = "texlive-beuron-2023.209.1.3svn46374-54.1.noarch.rpm"
RPM_HASH = "5dbfcd4e2e3d37346316012cb5afbd325c260b3b72eec99f096535b4c78da635b983be44b1eb877c8d70c20ae3c442f40a13a59aa51c744325f4949642086630"
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
