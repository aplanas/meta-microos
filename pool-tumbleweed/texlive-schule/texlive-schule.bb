SUMMARY = "Support for teachers at German schools"
DESCRIPTION = "The 'schule' bundle was built to provide packages and commands \
that could be useful for documents in German schools. At the \
moment its main focus lies on documents for informatics as a \
school subject. An extension for physics is currently in \
progress. Extensions for other subjects are welcome. For the \
time being, the whole package splits up into individual \
packages for informatics (including syntax diagrams, \
Nassi-Shneiderman diagrams, sequence diagrams, object diagrams, \
and class diagrams) as well as classes for written exams \
(tests, quizzes, teaching observations, information sheets, \
worksheets, and answer keys)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.3svn60210"

RPM_NAME = "texlive-schule-2023.201.0.0.8.3svn60210-53.1.noarch.rpm"
RPM_HASH = "2d4ae54454852c372828236a686bf9579b7e86c54014083c8281d1ff7f8da63c894187e3c2dde8949ff0de188fbcdac2cef5539616d8c6de672068504f656a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-relaycircuit.sty \
tex-schule.fach.EvReligion.code.tex \
tex-schule.fach.Geschichte.code.tex \
tex-schule.fach.Geschichte.pakete.tex \
tex-schule.fach.Informatik.code.tex \
tex-schule.fach.Informatik.pakete.tex \
tex-schule.fach.Physik.code.tex \
tex-schule.fach.Physik.pakete.tex \
tex-schule.mod.Aufgaben.code.tex \
tex-schule.mod.Aufgaben.optionen.tex \
tex-schule.mod.Aufgaben.pakete.tex \
tex-schule.mod.Bewertung.code.tex \
tex-schule.mod.Bewertung.optionen.tex \
tex-schule.mod.Bewertung.pakete.tex \
tex-schule.mod.Format.code.tex \
tex-schule.mod.Format.optionen.tex \
tex-schule.mod.Format.pakete.tex \
tex-schule.mod.Formulare.code.tex \
tex-schule.mod.Kuerzel.code.tex \
tex-schule.mod.Kuerzel.optionen.tex \
tex-schule.mod.Lizenzen.code.tex \
tex-schule.mod.Lizenzen.optionen.tex \
tex-schule.mod.Lizenzen.pakete.tex \
tex-schule.mod.Metadaten.code.tex \
tex-schule.mod.Metadaten.optionen.tex \
tex-schule.mod.Papiertypen.code.tex \
tex-schule.mod.Storycard.code.tex \
tex-schule.mod.Storycard.pakete.tex \
tex-schule.mod.Symbole.code.tex \
tex-schule.mod.Symbole.pakete.tex \
tex-schule.mod.Texte.code.tex \
tex-schule.mod.Texte.pakete.tex \
tex-schule.mod.genord.code.tex \
tex-schule.sty \
tex-schule.typ.Beurteilung.code.tex \
tex-schule.typ.Beurteilung.optionen.tex \
tex-schule.typ.Beurteilung.pakete.tex \
tex-schule.typ.ab.code.tex \
tex-schule.typ.ab.pakete.tex \
tex-schule.typ.folie.code.tex \
tex-schule.typ.folie.pakete.tex \
tex-schule.typ.kl.code.tex \
tex-schule.typ.kl.optionen.tex \
tex-schule.typ.kl.pakete.tex \
tex-schule.typ.leit.code.tex \
tex-schule.typ.leit.optionen.tex \
tex-schule.typ.leit.pakete.tex \
tex-schule.typ.lzk.code.tex \
tex-schule.typ.lzk.pakete.tex \
tex-schule.typ.ub.code.tex \
tex-schule.typ.ub.pakete.tex \
tex-schule.typ.ueb.code.tex \
tex-schule.typ.ueb.pakete.tex \
tex-schuleab.cls \
tex-schulealt.sty \
tex-schulein.cls \
tex-schuleit.cls \
tex-schulekl.cls \
tex-schulekl.sty \
tex-schuleub.cls \
tex-schuleue.cls \
tex-schulinf.sty \
tex-schullsg.cls \
tex-schullzk.cls \
tex-schullzk.sty \
tex-schulphy.sty \
tex-xsim.style.schule-binnen.code.tex \
tex-xsim.style.schule-default.code.tex \
tex-xsim.style.schule-keinenummer.code.tex \
tex-xsim.style.schule-keinepunkte.code.tex \
tex-xsim.style.schule-keintitel.code.tex \
tex-xsim.style.schule-randpunkte.code.tex \
tex-xsim.style.schule-tabelle-kurz.code.tex \
tex-xsim.style.schule-tcolorbox.code.tex \
texlive-schule"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-calc.sty \
tex-cancel.sty \
tex-ccicons.sty \
tex-circuitikz.sty \
tex-csquotes.sty \
tex-environ.sty \
tex-etex.sty \
tex-eurosym.sty \
tex-fontenc.sty \
tex-forarray.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-mdframed.sty \
tex-mhchem.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-paralist.sty \
tex-pdfpages.sty \
tex-pgf-umlcd.sty \
tex-pgf-umlsd.sty \
tex-pgfopts.sty \
tex-ragged2e.sty \
tex-rotating.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-silence.sty \
tex-struktex.sty \
tex-svn-multi.sty \
tex-syntaxdi.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-units.sty \
tex-varwidth.sty \
tex-warning.sty \
tex-wrapfig.sty \
tex-xargs.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xmpincl.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
