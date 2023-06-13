SUMMARY = "Semantic, keyval-based mathematics"
DESCRIPTION = "The SemanTeX package for LaTeX delivers a more semantic, \
systematized way of writing mathematics, compared to the \
classical math syntax in LaTeX. The system uses keyval syntax, \
and the user can define their own keys and customize the system \
down to the last detail. At the same time, care has been taken \
to make the syntax as simple, natural, practical, and \
lightweight as possible. Furthermore, the package has a \
companion package, called stripsemantex, which allows you to \
completely strip your documents of SemanTeX markup to prepare \
them e.g. for publication. The package is still in beta, but is \
considered feature-complete and more or less stable, so using \
it at this point should be safe. Still, suggestions, ideas, and \
bug reports are more than welcome!"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.525svn65679"

RPM_NAME = "texlive-semantex-2023.201.0.0.525svn65679-53.1.noarch.rpm"
RPM_HASH = "5eee2410c5cd75603814d6442da36e148315e7359e888bf565e9fd08a48091369a8395c791d2770208f177858198b5e230c1311d19326a6e1b5e9809b5459ac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(semantex.sty) \
tex(stripsemantex.sty) \
texlive-semantex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(l3keys2e.sty) \
tex(leftindex.sty) \
tex(semtex.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-semtex"

inherit rpm
