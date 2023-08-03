SUMMARY = "Alternative font handling in LaTeX"
DESCRIPTION = "The package provides a replacement for that part of psnfss and \
mfnfss that changes the default font. The package is \
distributed together with the psfont package, by the same \
author."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-altfont-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "23b2f5db8df6dfbe241ae2a4c5b3c852731dcc40f16daf5b368ff56ed10401ac0c75b47b91b3dc7d76f45eb3aa2a378c536693d6df8d5e0b3f322d58cf8f7abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-altfont.cfg \
tex-altfont.sty \
tex-psfont.cfg \
tex-psfont.sty \
texlive-altfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
