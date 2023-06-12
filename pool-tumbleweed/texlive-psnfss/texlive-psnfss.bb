SUMMARY = "Font support for common PostScript fonts"
DESCRIPTION = "Font definition files, macros and font metrics for \
freely-available Adobe Type 1 fonts. The font set consists of \
the 'LaserWriter 35' set (originally 'freely available' because \
embedded in PostScript printers), and a variety of other free \
fonts, together with some additions. Note that while many of \
the fonts are available in PostScript (and other) printers, \
most publishers require fonts embedded in documents, which \
requires that you have the fonts in your TeX system. \
Fortunately, there are free versions of the fonts from URW \
(available in the URW base5 bundle). The base set of text fonts \
covered by PSNFSS are: AvantGarde, Bookman, Courier, Helvetica, \
New Century Schoolbook, Palatino, Symbol, Times Roman and Zapf \
Dingbats. In addition, the fonts Bitstream Charter and Adobe \
Utopia are covered (those fonts were contributed to the Public \
Domain by their commercial foundries). Separate packages are \
provided to load each font for use as main text font. The \
packages helvet (which allows Helvetica to be loaded with its \
size scaled to something more nearly appropriate for its use as \
a Sans-Serif font to match Times) and pifont (which provides \
the means to select single glyphs from symbol fonts) are \
tailored to special requirements of their fonts. Mathematics \
are covered by the mathptmx package, which constructs passable \
mathematics from a combination of Times Roman, Symbol and some \
glyphs from Computer Modern, and by Pazo Math (optionally \
extended with the fpl small-caps and old-style figures fonts) \
which uses Palatino as base font, with the mathpazo fonts. The \
bundle as a whole is part of the LaTeX 'required' set of \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.9.3svn54694"

RPM_NAME = "texlive-psnfss-2023.201.9.3svn54694-52.1.noarch.rpm"
RPM_HASH = "49bf80e1d7ad6b99e345027684959d8f9e0c0ddf963cfa5f7dab072b2f7d0a2226e35cac36dfe63e62026954dcbd0c7eb210b67af479682dae9c93495bd31b41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(8rbch.fd) \
tex(8rpag.fd) \
tex(8rpbk.fd) \
tex(8rpcr.fd) \
tex(8rphv.fd) \
tex(8rpnc.fd) \
tex(8rppl.fd) \
tex(8rptm.fd) \
tex(8rput.fd) \
tex(8rpzc.fd) \
tex(avant.sty) \
tex(bookman.sty) \
tex(chancery.sty) \
tex(charter.map) \
tex(charter.sty) \
tex(courier.sty) \
tex(fpls.map) \
tex(helvet.sty) \
tex(mathpazo.sty) \
tex(mathpple.sty) \
tex(mathptm.sty) \
tex(mathptmx.sty) \
tex(newcent.sty) \
tex(omlbch.fd) \
tex(omlpag.fd) \
tex(omlpbk.fd) \
tex(omlpcr.fd) \
tex(omlphv.fd) \
tex(omlpnc.fd) \
tex(omlppl.fd) \
tex(omlptm.fd) \
tex(omlptmcm.fd) \
tex(omlput.fd) \
tex(omlpzc.fd) \
tex(omlzplm.fd) \
tex(omlzpple.fd) \
tex(omlztmcm.fd) \
tex(omsbch.fd) \
tex(omspag.fd) \
tex(omspbk.fd) \
tex(omspcr.fd) \
tex(omsphv.fd) \
tex(omspnc.fd) \
tex(omsppl.fd) \
tex(omsptm.fd) \
tex(omsput.fd) \
tex(omspzc.fd) \
tex(omspzccm.fd) \
tex(omszplm.fd) \
tex(omszpple.fd) \
tex(omsztmcm.fd) \
tex(omxpsycm.fd) \
tex(omxzplm.fd) \
tex(omxzpple.fd) \
tex(omxztmcm.fd) \
tex(ot1bch.fd) \
tex(ot1pag.fd) \
tex(ot1pbk.fd) \
tex(ot1pcr.fd) \
tex(ot1phv.fd) \
tex(ot1pnc.fd) \
tex(ot1ppl.fd) \
tex(ot1pplj.fd) \
tex(ot1pplx.fd) \
tex(ot1ptm.fd) \
tex(ot1ptmcm.fd) \
tex(ot1put.fd) \
tex(ot1pzc.fd) \
tex(ot1zplm.fd) \
tex(ot1zpple.fd) \
tex(ot1ztmcm.fd) \
tex(palatino.sty) \
tex(pazo.map) \
tex(pifont.sty) \
tex(psnfss.map) \
tex(t1bch.fd) \
tex(t1pag.fd) \
tex(t1pbk.fd) \
tex(t1pcr.fd) \
tex(t1phv.fd) \
tex(t1pnc.fd) \
tex(t1ppl.fd) \
tex(t1pplj.fd) \
tex(t1pplx.fd) \
tex(t1ptm.fd) \
tex(t1put.fd) \
tex(t1pzc.fd) \
tex(times.sty) \
tex(ts1bch.fd) \
tex(ts1pag.fd) \
tex(ts1pbk.fd) \
tex(ts1pcr.fd) \
tex(ts1phv.fd) \
tex(ts1pnc.fd) \
tex(ts1ppl.fd) \
tex(ts1pplj.fd) \
tex(ts1pplx.fd) \
tex(ts1ptm.fd) \
tex(ts1put.fd) \
tex(ts1pzc.fd) \
tex(ufplm.fd) \
tex(ufplmbb.fd) \
tex(upsy.fd) \
tex(upzd.fd) \
tex(utopia.map) \
tex(utopia.sty) \
texlive-psnfss"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-graphics \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-symbol \
texlive-zapfding"

inherit rpm
