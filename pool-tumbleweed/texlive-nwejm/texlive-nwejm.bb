SUMMARY = "Support for the journal 'North-Western European Journal of Mathematics'"
DESCRIPTION = "The bundle includes LaTeX classes and BibLaTeX styles files \
dedicated to the new journal 'North-Western European Journal of \
Mathematics': nwejm for the complete issues of the journal, \
aimed at the NWEJM's team, nwejmart, intended for the authors \
who wish to publish an article in the NWEJM. This class's goal \
is to: faithfully reproduce the layout of the nwejm, thus \
enabling the authors to be able to work their document in \
actual conditions, provide a number of tools (commands and \
environments) to facilitate the drafting of documents, in \
particular those containing mathematical formulas."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.5svn64462"

RPM_NAME = "texlive-nwejm-2023.209.1.0.5svn64462-55.1.noarch.rpm"
RPM_HASH = "91ed0a095f789bb16707dfa1dfd8af0cd1a0f8b6c08a37c43bd51a69fb916721a235cbbc0555ddd969b8307baff4a3ed3420a8d844789ca752f3f4a8404b5335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nwejm-logos-collection.tex \
tex-nwejm.bbx \
tex-nwejm.cbx \
tex-nwejm.cfg \
tex-nwejm.cls \
tex-nwejm.lbx \
tex-nwejmart.cls \
texlive-nwejm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-afterpage.sty \
tex-array.sty \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-babel.sty \
tex-biblatex.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-currfile.sty \
tex-datatool.sty \
tex-datetime2.sty \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-esvect.sty \
tex-etoc.sty \
tex-etoolbox.sty \
tex-fmtcount.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-footnote.sty \
tex-geometry.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-ifoddpage.sty \
tex-import.sty \
tex-kpfonts-otf.sty \
tex-kpfonts.sty \
tex-l3keys2e.sty \
tex-marginnote.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-nag.sty \
tex-ntheorem.sty \
tex-placeins.sty \
tex-refcount.sty \
tex-standalone.sty \
tex-subcaption.sty \
tex-tcolorbox.sty \
tex-tikzpagenodes.sty \
tex-titlesec.sty \
tex-tkz-berge.sty \
tex-tocloft.sty \
tex-tocvsec2.sty \
tex-translations.sty \
tex-unicode-math.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xr.sty \
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
