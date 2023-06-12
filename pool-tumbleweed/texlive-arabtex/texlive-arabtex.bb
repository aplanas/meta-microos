SUMMARY = "Macros and fonts for typesetting Arabic"
DESCRIPTION = "ArabTeX is a package extending the capabilities of TeX/LaTeX to \
generate Arabic and Hebrew text. Input may be in ASCII \
transliteration or other encodings (including UTF-8); output \
may be Arabic, Hebrew, or any of several languages that use the \
Arabic script. ArabTeX consists of a TeX macro package and \
Arabic and Hebrew fonts (provided both in Metafont format and \
Adobe Type 1). The Arabic font is presently only available in \
the Naskhi style. ArabTeX will run with Plain TeX and also with \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.17svn64260"

RPM_NAME = "texlive-arabtex-2023.201.3.17svn64260-54.1.noarch.rpm"
RPM_HASH = "f56e2ec647cb7ae7c4685236fd73e9843fe08ff8efbcd8c688657675dc20b423a83ec8ed359c1699b2e7fb127b36cb6be9468d640a0eaf94618e8c5e3234edab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Uxnsh.fd) \
tex(abidir.sty) \
tex(abjad.sty) \
tex(aboxes.sty) \
tex(acjk.sty) \
tex(acmd.sty) \
tex(aconfig.sty) \
tex(aedpatch.sty) \
tex(afonts.sty) \
tex(afonts0.sty) \
tex(afonts1.sty) \
tex(afonts2.sty) \
tex(afoot.sty) \
tex(alatex.sty) \
tex(aligs.sty) \
tex(alists.sty) \
tex(alocal.sty) \
tex(altxext.sty) \
tex(amac.sty) \
tex(aoutput.sty) \
tex(aparse.sty) \
tex(apatch.sty) \
tex(arababel.sty) \
tex(arabart.cls) \
tex(arabaux.sty) \
tex(arabbook.cls) \
tex(arabchrs.sty) \
tex(arabext.sty) \
tex(arabrep.cls) \
tex(arabrep1.cls) \
tex(arabskel.sty) \
tex(arabsymb.sty) \
tex(arabtex.map) \
tex(arabtex.sty) \
tex(arabtex.tex) \
tex(arabtoks.sty) \
tex(ascan.sty) \
tex(asect.sty) \
tex(asize10.clo) \
tex(asize11.clo) \
tex(asize12.clo) \
tex(asmo449.sty) \
tex(asmo449a.sty) \
tex(atabg.sty) \
tex(atrans.sty) \
tex(awrite.sty) \
tex(bhs.sty) \
tex(bhslabel.sty) \
tex(buck.sty) \
tex(captions.def) \
tex(cp1256.sty) \
tex(etrans.sty) \
tex(gedalin.sty) \
tex(hcaption.tfm) \
tex(hclassic.tfm) \
tex(hebchrs.sty) \
tex(hebsymb.sty) \
tex(hebtex.sty) \
tex(hebtex.tex) \
tex(hecmd.sty) \
tex(hefonts.sty) \
tex(hefonts0.sty) \
tex(hefonts1.sty) \
tex(hefonts2.sty) \
tex(heparse.sty) \
tex(hepatch.sty) \
tex(hescan.sty) \
tex(hetrans.sty) \
tex(hewrite.sty) \
tex(hmac.sty) \
tex(isiri.sty) \
tex(iso88596.sty) \
tex(nash14.tfm) \
tex(nash14bf.tfm) \
tex(nashbf.sty) \
tex(raw.sty) \
tex(saw.sty) \
tex(sotoku.sty) \
tex(twoblks.sty) \
tex(uheb.fd) \
tex(unash.fd) \
tex(utf8.sty) \
tex(utfcode.sty) \
tex(verses.sty) \
tex(witbhs.sty) \
tex(xarbskel.sty) \
tex(xarbsymb.sty) \
tex(xnsh14.tfm) \
tex(xnsh14bf.tfm) \
tex(yarborn.tfm) \
tex(yiddish.sty) \
texlive-arabtex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-arabtex-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
