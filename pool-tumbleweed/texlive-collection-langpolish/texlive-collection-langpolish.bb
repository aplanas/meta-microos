SUMMARY = "Polish"
DESCRIPTION = "Support for Polish."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-langpolish-2023.208.svn54074-58.1.noarch.rpm"
RPM_HASH = "1a05859c796436fee2a3db552d2ea321638e91e002aaa5d0c15c8c9cc12b4fd8428e4963c3c002c2080e5ca9141ca378a2f361ae1bb086befd51ce4a8ee6ee21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langpolish"

RDEPENDS:${PN} += "texlive-babel-polish \
texlive-bredzenie \
texlive-cc-pl \
texlive-collection-basic \
texlive-collection-latex \
texlive-gustlib \
texlive-gustprog \
texlive-hyphen-polish \
texlive-lshort-polish \
texlive-mex \
texlive-mwcls \
texlive-pl \
texlive-polski \
texlive-przechlewski-book \
texlive-qpxqtx \
texlive-tap \
texlive-tex-virtual-academy-pl \
texlive-texlive-pl \
texlive-utf8mex"

inherit rpm
