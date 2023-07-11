SUMMARY = "Humanities packages"
DESCRIPTION = "Packages for law, linguistics, social sciences, humanities, \
etc."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65216"

RPM_NAME = "texlive-collection-humanities-2023.208.svn65216-60.1.noarch.rpm"
RPM_HASH = "9f784235b2f34e04fa02eaa0896db23df1f41f2c43e33c8ed89ae3d97bdcb3d9b7e751a19b526ef2bf22b0a33e7fa7a5563c67771f15d78838fb5a77d1442979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-humanities"

RDEPENDS:${PN} += "texlive-adtrees \
texlive-bibleref \
texlive-bibleref-lds \
texlive-bibleref-mouth \
texlive-bibleref-parse \
texlive-collection-latex \
texlive-covington \
texlive-diadia \
texlive-dramatist \
texlive-dvgloss \
texlive-ecltree \
texlive-edfnotes \
texlive-eledform \
texlive-eledmac \
texlive-expex \
texlive-gb4e \
texlive-gmverse \
texlive-jura \
texlive-juraabbrev \
texlive-juramisc \
texlive-jurarsp \
texlive-langnames \
texlive-ledmac \
texlive-lexikon \
texlive-lexref \
texlive-ling-macros \
texlive-linguex \
texlive-liturg \
texlive-metrix \
texlive-nnext \
texlive-parallel \
texlive-parrun \
texlive-phonrule \
texlive-plari \
texlive-play \
texlive-poemscol \
texlive-poetry \
texlive-poetrytex \
texlive-qobitree \
texlive-qtree \
texlive-reledmac \
texlive-rrgtrees \
texlive-rtklage \
texlive-screenplay \
texlive-screenplay-pkg \
texlive-sides \
texlive-stage \
texlive-textglos \
texlive-thalie \
texlive-theatre \
texlive-tree-dvips \
texlive-verse \
texlive-xyling"

inherit rpm
