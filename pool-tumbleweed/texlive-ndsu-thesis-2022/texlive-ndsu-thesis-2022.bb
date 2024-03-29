SUMMARY = "North Dakota State University disquisition class 2022"
DESCRIPTION = "A class for generating disquisitions (MS and PhD - thesis, \
dissertation, and paper), intended to be in compliance with \
North Dakota State University requirements. Updated (2022) \
North Dakota State University LaTeX thesis class features \
several functionalities, including not limited to, numbered and \
non-numbered versions, overall justification, document point \
sizes, fonts options, SI units, show frames, URL breaking, long \
tables, subfigures, multi-page figures, chapter styles, \
subfiles, algorithm listing, BibTeX and BibLaTeX support, \
individual chapter and whole document bibliography, natbib \
citations, and clever references. The supplied simple and \
extended samples illustrate these features and guide students \
to use the class."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63881"

RPM_NAME = "texlive-ndsu-thesis-2022-2023.209.svn63881-55.1.noarch.rpm"
RPM_HASH = "32907ef57449e714e69e870123b0af2883a0c6e25f58d8f1b053e4411b1960e9b7616bdf18ca25bac8d111cfee0061a1803d1ba1ce2de27236ba3462d0f8b7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ndsu-thesis-2022.cls \
texlive-ndsu-thesis-2022"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-book.cls \
tex-bookman.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-charter.sty \
tex-cleveref.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-fontenc.sty \
tex-gentium.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-kantlipsum.sty \
tex-kpfonts.sty \
tex-libertine.sty \
tex-lineno.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-mathdesign.sty \
tex-mathptmx.sty \
tex-mwe.sty \
tex-newcent.sty \
tex-newfloat.sty \
tex-palatino.sty \
tex-pdflscape.sty \
tex-rotating.sty \
tex-setspace.sty \
tex-siunitx.sty \
tex-soul.sty \
tex-subfig.sty \
tex-subfiles.sty \
tex-tabu.sty \
tex-tabularx.sty \
tex-tgbonum.sty \
tex-tgpagella.sty \
tex-tgschola.sty \
tex-tgtermes.sty \
tex-threeparttable.sty \
tex-threeparttablex.sty \
tex-tikz.sty \
tex-times.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocbibind.sty \
tex-tocloft.sty \
tex-todonotes.sty \
tex-totalcount.sty \
tex-url.sty \
tex-utopia.sty \
tex-xcolor.sty \
tex-xspace.sty \
tex-xtab.sty \
tex-zlmtt.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
