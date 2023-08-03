SUMMARY = "A font offering the new (Indian) Rupee symbol"
DESCRIPTION = "The package provides LaTeX support for the (Indian) Rupee \
symbol font, created by TechFat. The original font has been \
converted to Adobe Type 1 format, and simple LaTeX support \
written for its use."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02svn20770"

RPM_NAME = "texlive-tfrupee-2023.209.1.02svn20770-55.1.noarch.rpm"
RPM_HASH = "ef6b51592f8a7bc6b1e4c0a8c9d7527888842a6c8fd5d48c2c9314a99a97ee787454e7d056075224e608e80a1645e22fb25b75760b0ad98107f12d4e6daa2ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tfrupee.map \
tex-tfrupee.sty \
tex-tfrupee.tfm \
texlive-tfrupee"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tfrupee-fonts"

inherit rpm
