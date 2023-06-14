SUMMARY = "Bundle of classes for 'La Gazette des Mathematiciens'"
DESCRIPTION = "This bundle provides two classes and BibLaTeX styles for the \
French journal 'La Gazette des Mathematiciens': gzt for the \
complete issues of the journal, aimed at the Gazette's team, \
gztarticle, intended for authors who wish to publish an article \
in the Gazette. This class's goals are to faithfully reproduce \
the layout of the Gazette, thus enabling the authors to be able \
to work their document in actual conditions, and provide a \
number of tools (commands and environments) to facilitate the \
drafting of documents, in particular those containing \
mathematical formulas."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.3svn63591"

RPM_NAME = "texlive-gzt-2023.201.1.1.3svn63591-53.1.noarch.rpm"
RPM_HASH = "5322fd50c86fc160c0b6a2aff29b8da51b03d7bf5c2c7a4a92b685554d1ae7a996e4adffbba0b3dc4c5e57e706df2c7f18b3dd27b208f588bafae9bad660048f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gzt.cfg \
tex-gzt.cls \
tex-gzt.lbx \
tex-gztarticle.cls \
texlive-gzt"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-afterpage.sty \
tex-amsthm.sty \
tex-array.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-datatool.sty \
tex-datetime.sty \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-epigraph.sty \
tex-esvect.sty \
tex-etoc.sty \
tex-eurosym.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iflang.sty \
tex-import.sty \
tex-inputenc.sty \
tex-kpfonts.sty \
tex-l3keys2e.sty \
tex-lastpage.sty \
tex-longtable.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-mwe.sty \
tex-nccparskip.sty \
tex-pagegrid.sty \
tex-pgfplots.sty \
tex-placeins.sty \
tex-ragged2e.sty \
tex-rsfso.sty \
tex-standalone.sty \
tex-tableof.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-textcase.sty \
tex-thmtools.sty \
tex-tikz.sty \
tex-tikzpagenodes.sty \
tex-titlesec.sty \
tex-translator.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xpatch.sty \
tex-xspace.sty \
tex-zref-totpages.sty \
tex-zref-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
