SUMMARY = "Sophisticated Bibliographies in LaTeX (multiscript version)"
DESCRIPTION = "This package is the 'multiscript' version of the BibLaTeX \
package intended to solve the issues faced by those wishing to \
create multiligual bibliographies. It is intended to be \
backwards-compatible with the standard BibLaTeX package and \
includes significantly enhanced optional functionality: Fields \
in data files can have different form/language alternates in \
the same entry Options to select/print a specific alternate are \
generally available babel/polyglossia language switching is \
done automatically based on the language associated with a \
field The intention is that this version will eventually \
replace standard BibLaTeX and is being released as an \
independent package to allow for wider testing and feedback. It \
can be installed in parallel with standard BibLaTeX and the \
package name is biblatex-ms. It requires the use of the \
multiscript version of biber (biber-ms)."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0_1svn66480"

RPM_NAME = "texlive-biblatex-ms-2023.209.4.0_1svn66480-54.1.noarch.rpm"
RPM_HASH = "7d27065c87ab5cb2378bb504a993e584d7cc2dc594e0cadd99eeb3752cb551ea27d717241ac547381b315100f1da6dd68d1f02570c60307d2ca613f88947b4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UKenglish-ms.lbx \
tex-USenglish-ms.lbx \
tex-alphabetic-ms.bbx \
tex-alphabetic-ms.cbx \
tex-alphabetic-verb-ms.bbx \
tex-alphabetic-verb-ms.cbx \
tex-american-ms.lbx \
tex-australian-ms.lbx \
tex-austrian-ms.lbx \
tex-authortitle-comp-ms.bbx \
tex-authortitle-comp-ms.cbx \
tex-authortitle-ibid-ms.bbx \
tex-authortitle-ibid-ms.cbx \
tex-authortitle-icomp-ms.bbx \
tex-authortitle-icomp-ms.cbx \
tex-authortitle-ms.bbx \
tex-authortitle-ms.cbx \
tex-authortitle-tcomp-ms.bbx \
tex-authortitle-tcomp-ms.cbx \
tex-authortitle-terse-ms.bbx \
tex-authortitle-terse-ms.cbx \
tex-authortitle-ticomp-ms.bbx \
tex-authortitle-ticomp-ms.cbx \
tex-authoryear-comp-ms.bbx \
tex-authoryear-comp-ms.cbx \
tex-authoryear-ibid-ms.bbx \
tex-authoryear-ibid-ms.cbx \
tex-authoryear-icomp-ms.bbx \
tex-authoryear-icomp-ms.cbx \
tex-authoryear-ms.bbx \
tex-authoryear-ms.cbx \
tex-basque-ms.lbx \
tex-biblatex-ms.cfg \
tex-biblatex-ms.def \
tex-biblatex-ms.sty \
tex-blx-bibtex-ms.def \
tex-blx-case-expl3-ms.sty \
tex-blx-case-latex2e-ms.sty \
tex-blx-compat-ms.def \
tex-blx-dm-ms.def \
tex-blx-mcite-ms.def \
tex-blx-natbib-ms.def \
tex-blx-unicode-ms.def \
tex-brazil-ms.lbx \
tex-brazilian-ms.lbx \
tex-british-ms.lbx \
tex-bulgarian-ms.lbx \
tex-canadian-ms.lbx \
tex-catalan-ms.lbx \
tex-croatian-ms.lbx \
tex-czech-ms.lbx \
tex-danish-ms.lbx \
tex-debug-ms.bbx \
tex-debug-ms.cbx \
tex-draft-ms.bbx \
tex-draft-ms.cbx \
tex-dutch-ms.lbx \
tex-english-ms.lbx \
tex-estonian-ms.lbx \
tex-finnish-ms.lbx \
tex-french-ms.lbx \
tex-galician-ms.lbx \
tex-german-ms.lbx \
tex-greek-ms.lbx \
tex-hungarian-ms.lbx \
tex-icelandic-ms.lbx \
tex-italian-ms.lbx \
tex-latvian-ms.lbx \
tex-lithuanian-ms.lbx \
tex-magyar-ms.lbx \
tex-marathi-ms.lbx \
tex-naustrian-ms.lbx \
tex-newzealand-ms.lbx \
tex-ngerman-ms.lbx \
tex-norsk-ms.lbx \
tex-nswissgerman-ms.lbx \
tex-numeric-comp-ms.bbx \
tex-numeric-comp-ms.cbx \
tex-numeric-ms.bbx \
tex-numeric-ms.cbx \
tex-numeric-verb-ms.bbx \
tex-numeric-verb-ms.cbx \
tex-nynorsk-ms.lbx \
tex-polish-ms.lbx \
tex-portuges-ms.lbx \
tex-portuguese-ms.lbx \
tex-reading-ms.bbx \
tex-reading-ms.cbx \
tex-romanian-ms.lbx \
tex-russian-ms.lbx \
tex-serbian-ms.lbx \
tex-serbianc-ms.lbx \
tex-slovak-ms.lbx \
tex-slovene-ms.lbx \
tex-slovenian-ms.lbx \
tex-spanish-ms.lbx \
tex-standard-ms.bbx \
tex-swedish-ms.lbx \
tex-swissgerman-ms.lbx \
tex-turkish-ms.lbx \
tex-ukrainian-ms.lbx \
tex-verbose-ibid-ms.bbx \
tex-verbose-ibid-ms.cbx \
tex-verbose-inote-ms.bbx \
tex-verbose-inote-ms.cbx \
tex-verbose-ms.bbx \
tex-verbose-ms.cbx \
tex-verbose-note-ms.bbx \
tex-verbose-note-ms.cbx \
tex-verbose-trad1-ms.bbx \
tex-verbose-trad1-ms.cbx \
tex-verbose-trad2-ms.bbx \
tex-verbose-trad2-ms.cbx \
tex-verbose-trad3-ms.bbx \
tex-verbose-trad3-ms.cbx \
texlive-biblatex-ms"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.bbx \
tex-american.lbx \
tex-authortitle-comp.cbx \
tex-authortitle-icomp.cbx \
tex-authortitle.bbx \
tex-authortitle.cbx \
tex-authoryear.bbx \
tex-brazilian.lbx \
tex-british.lbx \
tex-english.lbx \
tex-etoolbox.sty \
tex-expl3.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-logreq.sty \
tex-magyar.lbx \
tex-numeric.bbx \
tex-pdftexcmds.sty \
tex-portuguese.lbx \
tex-slovene.lbx \
tex-standard.bbx \
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
