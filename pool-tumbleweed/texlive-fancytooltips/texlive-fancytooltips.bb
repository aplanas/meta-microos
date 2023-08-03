SUMMARY = "Include a wide range of material in PDF tooltips"
DESCRIPTION = "The package was inspired by the cooltooltips package. In \
contrast to cooltooltips, fancytooltips allows inclusion of \
tooltips which contain arbitrary TeX material or a series of \
TeX materials (animated graphics) from an external PDF file. To \
see the tooltips, you have to open the files in Adobe Reader. \
The links and JavaScripts are inserted using eforms package \
from the AcroTeX bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn56291"

RPM_NAME = "texlive-fancytooltips-2023.209.1.8svn56291-53.1.noarch.rpm"
RPM_HASH = "0e72f0130a11108b40258232b1a6b7726505735e3bb43a5ab91d76f33e56277244c99f065fed455a991c7b0b49d91e90469ac349930b027380e09749ae304b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancytooltips.sty \
texlive-fancytooltips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-eso-pic.sty \
tex-graphicx.sty \
tex-ocg.sty \
tex-transparent.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
