SUMMARY = "A collection of LaTeX packages and classes"
DESCRIPTION = "The bundle collects packages and classes, along with one \
bibliography style and examples and scripts for converting TeX \
files. Many of the files in the collection are designed to \
support field biologists and/or Russian writers, while others \
have wider application. The collection includes: add2 - Save \
trees. Quick way to fit as many as possible into one page. Good \
for handouts. altverse - Typesetting verses. Straightforward \
typesetting, using the xtab package to aid layout. autolist - \
More lists. A means to define various sorts of list. biokey - \
Flexible identification key tables in LaTeX. The package \
provides straightforward macros to typeset sets of biological \
identification keys. Layout is flexible, and the macros will be \
useful in other disciplines. biolist - List observed species. \
Pretty formatting of species lists of flora and fauna. boldline \
- Heavier lines in tables. The package provides commands \
replacing \\hline and \\cline, as well as a table preamble \
element that generates heavy lines. cassete (with one 't') - \
Print labels for audio cassettes. This is a LaTeX2e class file \
(the only other cassette package on CTAN is cassette (with two \
't'), written for Plain TeX). classif2 - Biological \
classification tables. The package defines an environment \
classif that simplifies the process of typesetting \
classification tables. dline - Double line on the left of text. \
drcaps - Simple dropped capitals. The package offers simple \
macros for dropped capitals, in a couple of forms. etiketka - \
Class for typesetting business-card-sized information \
(including business cards). flower - Typesetting lists of \
flower formulas. isyntax - Interactively check LaTeX file \
syntax. numerus - Spell numbers in Russian words. punct - \
Within italicized text, punctuation is still straight, this is \
typographically more aesthetic. qqru - Universal quotation \
marks, for Russian and English. It is able also to convert \
uniform typewriter 'quotes' into left or right typographic \
quotes. rusnat - Bibliography style file, now deprecated. \
sltables - Simplified tables for LaTeX. These macros develop \
the concepts of the stables, which are designed to offer table \
macros whose use is 'as simple as one might hope'. Some would \
claim that LaTeX's built-in table specifications are as simple \
as one might hope, but this package offers many short-cuts and \
optimization of the mechanisms of tables. starfn - Stars as \
footnote marks. textfrac - Simple slanted fractions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52334"

RPM_NAME = "texlive-shipunov-2023.201.1.2svn52334-53.1.noarch.rpm"
RPM_HASH = "e1fab41c961a1185d29d1d8374e00fab6d9f108738815bed946728a26be51cab25480182703d9cf97e25d445f920312c1f3cfb8e2ed3c2bd92d39ed9161f4c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(add2-shipunov.sty) \
tex(altverse.sty) \
tex(autolist.sty) \
tex(biokey.sty) \
tex(biolist.sty) \
tex(boldline.sty) \
tex(cassete.cls) \
tex(classif2.sty) \
tex(dline-shipunov.sty) \
tex(drcaps.sty) \
tex(etiketka.cls) \
tex(flower.sty) \
tex(isyntax.sty) \
tex(numerus.sty) \
tex(punct.sty) \
tex(qqru-shipunov.sty) \
tex(sltables.sty) \
tex(starfn.sty) \
tex(textfrac-shipunov.sty) \
texlive-shipunov"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(article.cls) \
tex(calc.sty) \
tex(footnpag.sty) \
tex(ifthen.sty) \
tex(lineno.sty) \
tex(syntonly.sty) \
tex(xspace.sty) \
tex(xtab.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
