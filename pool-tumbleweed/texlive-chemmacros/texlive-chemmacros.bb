SUMMARY = "A collection of macros to support typesetting chemistry documents"
DESCRIPTION = "The bundle offers a collection of macros and commands which are \
intended to make typesetting chemistry documents faster and \
more convenient. Coverage includes some nomenclature commands, \
oxidation numbers, thermodynamic data, newman projections, etc. \
The package relies on the following supporting packages: \
chemformula, providing a command for typesetting chemical \
formulae and reactions (doing a similar task to that of \
mhchem); chemgreek, offering support for use of greek letters; \
and ghsystem, providing for the UN globally harmonised chemical \
notation. The packages are written using current versions of \
the experimental LaTeX 3 coding conventions and the LaTeX 3 \
support packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.2asvn62655"

RPM_NAME = "texlive-chemmacros-2023.201.6.2asvn62655-53.1.noarch.rpm"
RPM_HASH = "d279439b3c99642d548ba86162629f190b4cc3da161901647b523b522195c863ed0ba60f5a59006bb9ebb11f7bce1e66bc6e31739cc0371bcfeddf7c554f4304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chemmacros-2015-02-08.sty) \
tex(chemmacros-2020-03-07.sty) \
tex(chemmacros.sty) \
texlive-chemmacros"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(acro.sty) \
tex(amstext.sty) \
tex(bm.sty) \
tex(chemfig.sty) \
tex(chemformula.sty) \
tex(chemgreek.sty) \
tex(chemist.sty) \
tex(chemnum.sty) \
tex(elements.sty) \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(ghsystem.sty) \
tex(glossaries-extra.sty) \
tex(l3keys2e.sty) \
tex(longtable.sty) \
tex(mathtools.sty) \
tex(relsize.sty) \
tex(scrlfile.sty) \
tex(siunitx.sty) \
tex(tikz.sty) \
tex(translations.sty) \
tex(xfrac.sty) \
tex(xltabular.sty) \
tex(xparse.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
