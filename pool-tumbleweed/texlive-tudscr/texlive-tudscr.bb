SUMMARY = "Corporate Design of Technische Universitat Dresden"
DESCRIPTION = "The TUD-Script bundle provides both classes and packages in \
order to create LaTeX documents in the corporate design of the \
Technische Universitat Dresden. It bases on the KOMA-Script \
bundle, which must necessarily be present. For questions, \
problems and comments, please refer to either the LaTeX forum \
of the Dresden University of Technology or the GitHub 'tudscr' \
repository. The bundle offers: the three document classes \
tudscrartcl, tudscrreprt, and tudscrbook which serve as wrapper \
classes for scrartcl, scrreprt, and scrbook, the class \
tudscrposter for creating posters, the package tudscrsupervisor \
providing environments and macros to create tasks, evaluations \
and notices for scientific theses, the package tudscrfonts, \
which makes the corporate design fonts of the Technische \
Universitat Dresden available for LaTeX standard classes and \
KOMA-Script classes, the package fix-tudscrfonts, which \
provides the same fonts to additional corporate design classes \
not related to TUD-Script, the package tudscrcomp, which \
simplifies the switch to TUD-Script from external corporate \
design classes, the package mathswap for swapping math \
delimiters within numbers (similar to ionumbers), the package \
twocolfix for fixing the positioning bug of headings in \
twocolumn layout, and a comprehensive user documentation as \
well as several tutorials."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.06osvn64085"

RPM_NAME = "texlive-tudscr-2023.201.2.06osvn64085-52.1.noarch.rpm"
RPM_HASH = "4c19e4ff6dd4c5f410d650b9fd8eadedfbdb1e3b11acb7c34eed13bfd23ea10060472ee51758f7147621ffa330c5981ada39bb6095f055568cc23c15a0aa8252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fix-tudscrfonts.sty) \
tex(mathswap.sty) \
tex(tudscr-gitinfo.sty) \
tex(tudscrartcl.cls) \
tex(tudscrbase.sty) \
tex(tudscrbook.cls) \
tex(tudscrcolor.sty) \
tex(tudscrcomp.sty) \
tex(tudscrdoc.cls) \
tex(tudscrfonts.sty) \
tex(tudscrmanual.cls) \
tex(tudscrmanual.sty) \
tex(tudscrposter.cls) \
tex(tudscrreprt.cls) \
tex(tudscrsupervisor.sty) \
tex(twocolfix.sty) \
texlive-tudscr"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(auto-pst-pdf.sty) \
tex(babel.sty) \
tex(bm.sty) \
tex(bookmark.sty) \
tex(booktabs.sty) \
tex(calc.sty) \
tex(caption.sty) \
tex(csquotes.sty) \
tex(ellipsis.sty) \
tex(enumitem.sty) \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(filemod.sty) \
tex(floatrow.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hologo.sty) \
tex(hyphsubst.sty) \
tex(ifplatform.sty) \
tex(iftex.sty) \
tex(imakeidx.sty) \
tex(isodate.sty) \
tex(kvsetkeys.sty) \
tex(letltxmacro.sty) \
tex(listings.sty) \
tex(lmodern.sty) \
tex(marginnote.sty) \
tex(mathastext.sty) \
tex(newunicodechar.sty) \
tex(omliwona.fd) \
tex(omsiwona.fd) \
tex(pdfpages.sty) \
tex(pdftexcmds.sty) \
tex(quoting.sty) \
tex(ragged2e.sty) \
tex(scrbase.sty) \
tex(scrextend.sty) \
tex(scrhack.sty) \
tex(scrlayer-scrpage.sty) \
tex(scrlfile.sty) \
tex(scrwfile.sty) \
tex(setspace.sty) \
tex(shellesc.sty) \
tex(tabularx.sty) \
tex(textcomp.sty) \
tex(tikz.sty) \
tex(todonotes.sty) \
tex(trimspaces.sty) \
tex(units.sty) \
tex(url.sty) \
tex(varioref.sty) \
tex(xcolor.sty) \
tex(xpatch.sty) \
tex(xspace.sty) \
texlive \
texlive-cbfonts \
texlive-environ \
texlive-etoolbox \
texlive-filesystem \
texlive-geometry \
texlive-graphics \
texlive-greek-inputenc \
texlive-iwona \
texlive-koma-script \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mathastext \
texlive-mweights \
texlive-oberdiek \
texlive-opensans \
texlive-scripts \
texlive-scripts-bin \
texlive-trimspaces \
texlive-xcolor \
texlive-xpatch"

inherit rpm
