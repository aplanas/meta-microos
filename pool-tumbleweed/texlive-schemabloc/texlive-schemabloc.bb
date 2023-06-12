SUMMARY = "Draw block diagrams, using TikZ"
DESCRIPTION = "The package provides a set of macros for constructing block \
diagrams, using TikZ. (The blox package is an 'English \
translation' of this package.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn58212"

RPM_NAME = "texlive-schemabloc-2023.201.1.5svn58212-53.1.noarch.rpm"
RPM_HASH = "8523f3d2c35c1865e9e71742df1e5e1fc505f4ccdbc0701c24a5cc70fa20c45b5e9b42cc08ed7f63b6c2bbfab8d2aada85ac78e98cedc350fbf319e5668e18ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(schemabloc.sty) \
texlive-schemabloc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
