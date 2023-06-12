SUMMARY = "'Tabbing' front-end to stackengine"
DESCRIPTION = "The package provides a front end to the stackengine package, to \
allow tabbed stacking. In most cases, an existing stackengine \
command may be prepended with the word 'tabbed', 'align' or \
'tabular' to create a new tabbed version of a stacking macro. \
In addition, hooks in the package's parser that tabbed strings \
of data may be parsed, extracted, and reconstituted (not \
requiring use of any stacking constructions)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.10svn46848"

RPM_NAME = "texlive-tabstackengine-2023.201.2.10svn46848-54.1.noarch.rpm"
RPM_HASH = "a38187895814f565637eed7317e8959713cc5268e18692ff001c8b8ea7289820ad5782a9ee333d85e79c13502dd800f1bdba6fb949a631fd6b2d506ff0c78fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tabstackengine.sty) \
texlive-tabstackengine"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(listofitems.sty) \
tex(stackengine.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
