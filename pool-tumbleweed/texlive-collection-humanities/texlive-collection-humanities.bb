SUMMARY = "Humanities packages"
DESCRIPTION = "Packages for law, linguistics, social sciences, humanities, \
etc."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65216"

RPM_NAME = "texlive-collection-humanities-2023.208.svn65216-58.1.noarch.rpm"
RPM_HASH = "05958c5a277f5f68f8561697d16576b572ad491292ccb8df12a737aa8de6670f2be9c8820ef1e093e56e8d93d8602c54b85dde710d0d2390719fd766993831d4"
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
