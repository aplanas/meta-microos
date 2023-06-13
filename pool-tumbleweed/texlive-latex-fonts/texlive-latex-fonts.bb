SUMMARY = "A collection of fonts used in LaTeX distributions"
DESCRIPTION = "This is a collection of fonts for use with standard LaTeX \
packages and classes. It includes 'invisible' fonts (for use \
with the slides class), line and circle fonts (for use in the \
picture environment) and 'LaTeX symbol' fonts. For full support \
of a LaTeX installation, some Computer Modern font variants \
cmbsy(6-9), cmcsc(8,9), cmex(7-9) and cmmib(5-9) from the \
amsfonts distribution, are also necessary. The fonts are \
available as Metafont source, and metric (tfm) files are also \
provided. Most of the fonts are also available in Adobe Type 1 \
format, in the amsfonts distribution."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28888"

RPM_NAME = "texlive-latex-fonts-2023.201.svn28888-55.1.noarch.rpm"
RPM_HASH = "caaeb24afd32004d2cd7e4b82e87ec0c1cc65e8c3cc15fbad23602d6eba45ff2373e74220ca1f47d8131b5a7e228dd8b8dcedfd1ae06e205e2deffcc241608ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(icmcsc10.tfm) \
tex(icmex10.tfm) \
tex(icmmi8.tfm) \
tex(icmsy8.tfm) \
tex(icmtt8.tfm) \
tex(ilasy8.tfm) \
tex(ilcmss8.tfm) \
tex(ilcmssb8.tfm) \
tex(ilcmssi8.tfm) \
tex(lasy10.tfm) \
tex(lasy5.tfm) \
tex(lasy6.tfm) \
tex(lasy7.tfm) \
tex(lasy8.tfm) \
tex(lasy9.tfm) \
tex(lasyb10.tfm) \
tex(lcircle10.tfm) \
tex(lcirclew10.tfm) \
tex(lcmss8.tfm) \
tex(lcmssb8.tfm) \
tex(lcmssi8.tfm) \
tex(line10.tfm) \
tex(linew10.tfm) \
texlive-latex-fonts"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
