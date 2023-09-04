SUMMARY = "A mathematical paper template"
DESCRIPTION = "InkPaper is designed to write mathematical papers,especially \
designed for Mathematics Students. ZJGS students. magazine \
editors. NOTICE.This is not a Thesis class."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-inkpaper-2023.209.1.0svn54080-54.1.noarch.rpm"
RPM_HASH = "c4a2d64520192f6f3cd5b558674a02405600fdf8bb86454e2efbc3a1e65c0f088bee8c0847563e0a31606194fdc8a09901b0f22e99de7667104fee2f60db00e4"
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
