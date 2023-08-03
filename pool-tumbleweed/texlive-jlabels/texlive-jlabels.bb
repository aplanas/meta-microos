SUMMARY = "Make letter-sized pages of labels"
DESCRIPTION = "The package provides controls for the numbers of rows and \
columns."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24858"

RPM_NAME = "texlive-jlabels-2023.209.svn24858-56.1.noarch.rpm"
RPM_HASH = "e666fb4549f16cd231ee2309b2d88b0fc2fd827b8febb284379d5819df0518f863491f834fa7077f9d9e1828a08927bf656409866e47595a3b48f4723fb04464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jlabels.sty \
texlive-jlabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
