SUMMARY = "Sophisticated Bibliographies in LaTeX"
DESCRIPTION = "BibLaTeX is a complete reimplementation of the bibliographic \
facilities provided by LaTeX. Formatting of the bibliography is \
entirely controlled by LaTeX macros, and a working knowledge of \
LaTeX should be sufficient to design new bibliography and \
citation styles. BibLaTeX uses its own data backend program \
called 'biber' to read and process the bibliographic data. With \
biber, BibLaTeX has many features rivalling or surpassing other \
bibliography systems. To mention a few: Full Unicode support \
Highly customisable sorting using the Unicode Collation \
Algorithm + CLDR tailoring Highly customisable bibliography \
labels Complex macro-based on-the-fly data modification without \
changing your data sources A tool mode for transforming \
bibliographic data sources Multiple bibliographies and lists of \
bibliographic information in the same document with different \
sorting Highly customisable data source inheritance rules \
Polyglossia and babel suppport for automatic language switching \
for bibliographic entries and citations Automatic bibliography \
data recoding (UTF-8 -> latin1, LaTeX macros -> UTF-8 etc) \
Remote data sources Highly sophisticated automatic name and \
name list disambiguation system Highly customisable data model \
so users can define their own bibliographic data types \
Validation of bibliographic data against a data model \
Subdivided and/or filtered bibligraphies, bibliographies per \
chapter, section etc. Apart from the features unique to \
BibLaTeX, the package also incorporates core features of the \
following packages: babelbib, bibtopic, bibunits, chapterbib, \
cite, inlinebib, mcite and mciteplus, mlbib, multibib, \
splitbib. The package strictly requires e-TeX BibTeX, bibtex8, \
or Biber etoolbox 2.1 or later logreq 1.0 or later keyval \
ifthen url Biber, babel / polyglossia, and csquotes 4.4 or \
later are strongly recommended."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.19svn66403"

RPM_NAME = "texlive-biblatex-2023.209.3.19svn66403-54.1.noarch.rpm"
RPM_HASH = "57d1005f752ade6be4a213e9f24ef9b595d5213aad813ecb279f22fd0dca32a7f72331af94ace9aead02a08008e42551987d5f8d2fadbc95b39b85d2ba7d298a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UKenglish.lbx \
tex-USenglish.lbx \
tex-alphabetic-verb.bbx \
tex-alphabetic-verb.cbx \
tex-alphabetic.bbx \
tex-alphabetic.cbx \
tex-american.lbx \
tex-australian.lbx \
tex-austrian.lbx \
tex-authortitle-comp.bbx \
tex-authortitle-comp.cbx \
tex-authortitle-ibid.bbx \
tex-authortitle-ibid.cbx \
tex-authortitle-icomp.bbx \
tex-authortitle-icomp.cbx \
tex-authortitle-tcomp.bbx \
tex-authortitle-tcomp.cbx \
tex-authortitle-terse.bbx \
tex-authortitle-terse.cbx \
tex-authortitle-ticomp.bbx \
tex-authortitle-ticomp.cbx \
tex-authortitle.bbx \
tex-authortitle.cbx \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-authoryear-ibid.bbx \
tex-authoryear-ibid.cbx \
tex-authoryear-icomp.bbx \
tex-authoryear-icomp.cbx \
tex-authoryear.bbx \
tex-authoryear.cbx \
tex-basque.lbx \
tex-biblatex.cfg \
tex-biblatex.def \
tex-biblatex.sty \
tex-blx-bibtex.def \
tex-blx-case-expl3.sty \
tex-blx-case-latex2e.sty \
tex-blx-compat.def \
tex-blx-dm.def \
tex-blx-mcite.def \
tex-blx-natbib.def \
tex-blx-unicode.def \
tex-brazil.lbx \
tex-brazilian.lbx \
tex-british.lbx \
tex-bulgarian.lbx \
tex-canadian.lbx \
tex-catalan.lbx \
tex-croatian.lbx \
tex-czech.lbx \
tex-danish.lbx \
tex-debug.bbx \
tex-debug.cbx \
tex-draft.bbx \
tex-draft.cbx \
tex-dutch.lbx \
tex-english.lbx \
tex-estonian.lbx \
tex-finnish.lbx \
tex-french.lbx \
tex-galician.lbx \
tex-german.lbx \
tex-greek.lbx \
tex-hungarian.lbx \
tex-icelandic.lbx \
tex-italian.lbx \
tex-latvian.lbx \
tex-lithuanian.lbx \
tex-magyar.lbx \
tex-marathi.lbx \
tex-naustrian.lbx \
tex-newzealand.lbx \
tex-ngerman.lbx \
tex-norsk.lbx \
tex-nswissgerman.lbx \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
tex-numeric-verb.bbx \
tex-numeric-verb.cbx \
tex-numeric.bbx \
tex-numeric.cbx \
tex-nynorsk.lbx \
tex-polish.lbx \
tex-portuges.lbx \
tex-portuguese.lbx \
tex-reading.bbx \
tex-reading.cbx \
tex-romanian.lbx \
tex-russian.lbx \
tex-serbian.lbx \
tex-serbianc.lbx \
tex-slovak.lbx \
tex-slovene.lbx \
tex-slovenian.lbx \
tex-spanish.lbx \
tex-standard.bbx \
tex-swedish.lbx \
tex-swissgerman.lbx \
tex-turkish.lbx \
tex-ukrainian.lbx \
tex-verbose-ibid.bbx \
tex-verbose-ibid.cbx \
tex-verbose-inote.bbx \
tex-verbose-inote.cbx \
tex-verbose-note.bbx \
tex-verbose-note.cbx \
tex-verbose-trad1.bbx \
tex-verbose-trad1.cbx \
tex-verbose-trad2.bbx \
tex-verbose-trad2.cbx \
tex-verbose-trad3.bbx \
tex-verbose-trad3.cbx \
tex-verbose.bbx \
tex-verbose.cbx \
texlive-biblatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-logreq.sty \
tex-pdftexcmds.sty \
tex-url.sty \
tex-xparse.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kvoptions \
texlive-logreq \
texlive-pdftexcmds \
texlive-scripts \
texlive-scripts-bin \
texlive-url"

inherit rpm
