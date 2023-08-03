SUMMARY = "A Thesis Class for the Chair of Software Engineering II at the University of Passau, Germany"
DESCRIPTION = "The se2thesis bundle provides a document class for writing a \
theses with the Chair of Software Engineering II at the \
University of Passau, Germany. The class is based on Markus \
Kohm's KOMA-Script classes and provides several additions and \
customizations to these classes. While the class provides some \
basic settings, mostly regrading the type area, fonts, and the \
title page, it still provides large degrees of freedom to its \
users. However, the package's documentation also provides \
recommendations regarding several aspects, for example, \
recommending BibLaTeX for bibliographies."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn65645"

RPM_NAME = "texlive-se2thesis-2023.209.2.1.0svn65645-54.1.noarch.rpm"
RPM_HASH = "a7c850053ad8edbc5d9bcc4928e9f1c0ff325c900c56d26a2e1187a10092b509b6bcb47fce332b808575098c2c9eb6004bb1b542125fffd9164da650bef4455d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-se2colors.sty \
tex-se2fonts.sty \
tex-se2thesis.cls \
texlive-se2thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-AnonymousPro.sty \
tex-biblatex.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-libertinus-otf.sty \
tex-libertinus-type1.sty \
tex-lua-widow-control.sty \
tex-microtype.sty \
tex-ntheorem.sty \
tex-scrlayer-scrpage.sty \
tex-selnolig.sty \
tex-tcolorbox.sty \
tex-translations.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
