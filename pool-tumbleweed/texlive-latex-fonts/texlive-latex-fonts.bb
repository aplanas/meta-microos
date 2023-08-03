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

PV = "2023.209.svn28888"

RPM_NAME = "texlive-latex-fonts-2023.209.svn28888-56.1.noarch.rpm"
RPM_HASH = "f51aabaa4967cf441c64e47326e7dec7cd612774c116b393758745850ecaf7006ac8b8b7e0d8767910f9f3b2043a44ec9fde094008e22552a48f9f2320e711a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icmcsc10.tfm \
tex-icmex10.tfm \
tex-icmmi8.tfm \
tex-icmsy8.tfm \
tex-icmtt8.tfm \
tex-ilasy8.tfm \
tex-ilcmss8.tfm \
tex-ilcmssb8.tfm \
tex-ilcmssi8.tfm \
tex-lasy10.tfm \
tex-lasy5.tfm \
tex-lasy6.tfm \
tex-lasy7.tfm \
tex-lasy8.tfm \
tex-lasy9.tfm \
tex-lasyb10.tfm \
tex-lcircle10.tfm \
tex-lcirclew10.tfm \
tex-lcmss8.tfm \
tex-lcmssb8.tfm \
tex-lcmssi8.tfm \
tex-line10.tfm \
tex-linew10.tfm \
texlive-latex-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
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
