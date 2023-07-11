SUMMARY = "More flexible alignment in amsmath environments"
DESCRIPTION = "Allow aligning mathematical expressions on points where where \
direcly using & is not possible, especially in nested macros or \
environments."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.3svn63226"

RPM_NAME = "texlive-luamathalign-2023.208.0.0.3svn63226-53.1.noarch.rpm"
RPM_HASH = "c9a2190877c4a2d2ebefc4c5df24c273c6f455b853ed060d611b9247fe2ddf61f83205327c9207ee74947ded4b9093e95cd30592c1d52ffea82914b5bdc5466e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamathalign.sty \
texlive-luamathalign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
