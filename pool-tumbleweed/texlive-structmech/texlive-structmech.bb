SUMMARY = "A TikZ command set for structural mechanics drawings"
DESCRIPTION = "This package provides a collection of TikZ commands that allow \
users to draw basic elements in material/structural mechanics. \
It is thus possible to draw member forces, nodal \
forces/displacements, various boundary conditions, internal \
force distributions, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn58985"

RPM_NAME = "texlive-structmech-2023.201.1.1svn58985-57.1.noarch.rpm"
RPM_HASH = "c5262af8e19ec111a44c6e7a22a33daa91aa62bc904e14df36f0dfac105707a4894c38be9011e14d3bdd51ef05bc1239c2cf8f2acaa0ae345dbc371c65be4717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(structmech.sty) \
texlive-structmech"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(kvoptions.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
