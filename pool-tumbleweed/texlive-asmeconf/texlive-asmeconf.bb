SUMMARY = "A LaTeX template for ASME conference papers"
DESCRIPTION = "The asmeconf class provides a LaTeX template for ASME \
conference papers, following ASME's guidelines for margins, \
fonts, headings, captions, and reference formats as of 2022. \
This LaTeX template is intended to be used with the \
asmeconf.bst BibTeX style, for reference formatting, which is \
part of this distribution. Unlike older ASME conference LaTeX \
templates, asmeconf pdfs will contain hyperlinks, bookmarks, \
and metadata; and the references can include the DOI and URL \
fields. This LaTeX template enables inline author names, \
following ASME's current style, but it can also produce the \
traditional grid style. Options include line numbering, final \
column balancing, various math options, government copyright, \
archivability (PDF/A), and multilingual support. The code is \
compatible with pdfLaTeX or LuaLaTeX. This LaTeX template is \
not a publication of ASME, but it does conform to ASME's \
currently published guidelines for conference papers."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn65413"

RPM_NAME = "texlive-asmeconf-2023.201.1.34svn65413-53.1.noarch.rpm"
RPM_HASH = "dace698c21f8e4aa8945287da8279b1f71509ba64b574dad8ce7db1de776e28fd81be0ef11d1a1f1ce0aed78f1cb7bf33b1be6fb7603ee13eed7b4cbf95bbecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asmeconf.cls \
texlive-asmeconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-bm.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-dcolumn.sty \
tex-doi.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-flushend.sty \
tex-fnpos.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-glyphtounicode.tex \
tex-graphicx.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-hyphsubst.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-inconsolata.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-lineno.sty \
tex-luatexja-fontspec.sty \
tex-mathalfa.sty \
tex-mathtools.sty \
tex-metalogo.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-subcaption.sty \
tex-superiors.sty \
tex-textcase.sty \
tex-titlesec.sty \
tex-xcoffins.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
