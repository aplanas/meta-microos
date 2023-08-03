SUMMARY = "Simulate Win10, Ubuntu, and Mac terminals"
DESCRIPTION = "This LaTeX3 package provides environments terminal and \
terminal*, and macros \\termfile and \\termfile* to simulate \
Win10, Ubuntu and Mac terminals. It is based on tcolorbox, \
minted and listings."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn61414"

RPM_NAME = "texlive-termsim-2023.209.1.1.1svn61414-55.1.noarch.rpm"
RPM_HASH = "16eb1d10b64d3a5e6cdd3d031679afa52caa84388b01795c1bfc33acca8b535572ba96e85e75883fd240f8980fc69abad4bc04782c82a806d8ab8be82ae3d21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termsim.sty \
texlive-termsim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontawesome5.sty \
tex-l3keys2e.sty \
tex-tcolorbox.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
