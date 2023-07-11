SUMMARY = "A mathematical paper template"
DESCRIPTION = "InkPaper is designed to write mathematical papers,especially \
designed for Mathematics Students. ZJGS students. magazine \
editors. NOTICE.This is not a Thesis class."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0svn54080"

RPM_NAME = "texlive-inkpaper-2023.208.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "a05dcc87d424fe5626af5ace4ccb960c2dab1c41762d992b48a9dacb6dd6f58482bd5930748580c0c9b3054babb8307860014c3bba0e4e0efe6ac8b3cc491320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inkpaper.cls \
texlive-inkpaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abstract.sty \
tex-amsfonts.sty \
tex-amsthm.sty \
tex-asymptote.sty \
tex-calc.sty \
tex-cite.sty \
tex-ctexart.cls \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-mfirstuc.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-siunitx.sty \
tex-textcase.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
