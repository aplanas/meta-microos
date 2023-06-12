SUMMARY = "Class for the newsletter 'La Lettre GUTenberg' of the French TeX User Group GUTenberg"
DESCRIPTION = "The French TeX User Group GUTenberg has been publishing 'The \
GUTenberg Letter', its irregular newsletter, since February \
1993. For this purpose, a dedicated, in-house (La)TeX class was \
gradually created but, depending on new needs and on the people \
who were publishing the Newsletter, its development was \
somewhat erratic; in particular, it would not have been \
possible to publish its code as it was. In addition, its \
documentation was non-existent. The Board of Directors of the \
association, elected in November 2020, wished to provide a \
better structured, more perennial and documented class, able to \
be published on the CTAN. This is now done with the present \
'letgut' class. # French L'association GUTenberg publie 'La \
Lettre GUTenberg', son bulletin irregulomestriel, depuis \
fevrier 1993. Pour ce faire, une classe (La)TeX dediee, maison, \
a peu a peu vu le jour mais, au gre des nouveaux besoins et des \
personnes qui ont assure la publication de la Lettre, son \
developpement a ete quelque peu erratique ; il n'aurait \
notamment pas ete possible de publier son code en l'etat. En \
outre, sa documentation etait inexistante. Le Conseil \
d'Administration de l'association, elu en novembre 2020, a \
souhaite fournir une classe mieux structuree, davantage perenne \
et documentee, a meme d'etre publiee sur le CTAN. C'est \
desormais chose faite avec la presente classe letgut."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.6svn65548"

RPM_NAME = "texlive-letgut-2023.201.0.0.9.6svn65548-54.1.noarch.rpm"
RPM_HASH = "b230942c89fb3567e20e459b71958426b899060fc47387336fc83ddf06549330dc3fe873d7ccaf4fd263ece31131573525c1c51dee83cf67dbdb21826bc256eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(informations-gut.tex) \
tex(letgut-acronyms.tex) \
tex(letgut-banner.sty) \
tex(letgut-lstlang.sty) \
tex(letgut.cbx) \
tex(letgut.cls) \
tex(letgut.lbx) \
texlive-letgut"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(accsupp.sty) \
tex(acro.sty) \
tex(array.sty) \
tex(article.cls) \
tex(attachfile2.sty) \
tex(babel.sty) \
tex(biolinum.sty) \
tex(booktabs.sty) \
tex(bxtexlogo.sty) \
tex(cleveref.sty) \
tex(csquotes.sty) \
tex(enumitem.sty) \
tex(etoc.sty) \
tex(eurosym.sty) \
tex(fancyhdr.sty) \
tex(fancyvrb.sty) \
tex(floatrow.sty) \
tex(fontspec.sty) \
tex(fourier-orns.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hypcap.sty) \
tex(hyperref.sty) \
tex(l3keys2e.sty) \
tex(listings.sty) \
tex(mathtools.sty) \
tex(ninecolors.sty) \
tex(numeric.cbx) \
tex(parskip.sty) \
tex(pgfornament.sty) \
tex(placeins.sty) \
tex(refcount.sty) \
tex(siunitx.sty) \
tex(standalone.sty) \
tex(tabularray.sty) \
tex(tcolorbox.sty) \
tex(titlesec.sty) \
tex(varioref.sty) \
tex(xcolor.sty) \
tex(xurl.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
