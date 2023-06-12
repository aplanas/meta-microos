SUMMARY = "Typeset drama plays"
DESCRIPTION = "The package provides tools to typeset drama plays. It defines \
commands to introduce characters' lines, to render stage \
directions, to divide a play into acts and scenes and to build \
the dramatis personae automatically."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13asvn65249"

RPM_NAME = "texlive-thalie-2023.201.0.0.13asvn65249-54.1.noarch.rpm"
RPM_HASH = "27396f304a93b348f7407898c61ea0b1421a63a5309fa31c7ccdbdef01f6fe3de4e1f45cf4272f2d5ee729e400548d24c29c2c72589ffa593fe4a472583d6a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(thalie.sty) \
texlive-thalie"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(pgfkeys.sty) \
tex(pgfopts.sty) \
tex(suffix.sty) \
tex(tabularx.sty) \
tex(translations.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
