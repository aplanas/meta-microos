SUMMARY = "Typeset books for publication with Language Science Press"
DESCRIPTION = "This package allows you to typeset monographs and edited \
volumes for publication with Language Science Press \
(http://www.langsci-press.org). It includes all necessary files \
for title pages, frontmatter, main content, list of references \
and indexes. Dust jackets for BoD and Createspace \
(print-on-demand service providers) can also be produced."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65793"

RPM_NAME = "texlive-langsci-2023.201.svn65793-55.1.noarch.rpm"
RPM_HASH = "6baa2eb437b5cb28e88f05dc6b2f15897e28c3277a41ea0081792240b6459de325af319196b02c69b030928952d9c72b3493ef30c67d5cea7aec1ccbdade0881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(langsci-affiliations.sty) \
tex(langsci-bidi.sty) \
tex(langsci-gb4e.sty) \
tex(langsci-lgr.sty) \
tex(langsci-optional.sty) \
tex(langsci-series.def) \
tex(langsci-subparts.sty) \
tex(langsci-tbls.sty) \
tex(langsci-textipa.sty) \
tex(langsci-unified.bbx) \
tex(langsci-unified.cbx) \
tex(langscibook.cls) \
texlive-langsci"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(array.sty) \
tex(authorindex.sty) \
tex(authoryear.bbx) \
tex(babel.sty) \
tex(bookmark.sty) \
tex(booktabs.sty) \
tex(calc.sty) \
tex(caption.sty) \
tex(chngcntr.sty) \
tex(colortbl.sty) \
tex(datetime.sty) \
tex(epigraph.sty) \
tex(etoolbox.sty) \
tex(fancyvrb.sty) \
tex(floatrow.sty) \
tex(graphicx.sty) \
tex(hyphenat.sty) \
tex(ifxetex.sty) \
tex(index.sty) \
tex(kvoptions.sty) \
tex(lineno.sty) \
tex(mdframed.sty) \
tex(microtype.sty) \
tex(newtxmath.sty) \
tex(pbox.sty) \
tex(pifont.sty) \
tex(pst-barcode.sty) \
tex(rotating.sty) \
tex(scrlayer-scrpage.sty) \
tex(setspace.sty) \
tex(silence.sty) \
tex(soul.sty) \
tex(tabularx.sty) \
tex(tcolorbox.sty) \
tex(tikz.sty) \
tex(titlesec.sty) \
tex(titletoc.sty) \
tex(todonotes.sty) \
tex(ulem.sty) \
tex(unicode-math.sty) \
tex(url.sty) \
tex(xcolor.sty) \
tex(xeCJK.sty) \
tex(xparse.sty) \
tex(xpatch.sty) \
tex(xspace.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
