SUMMARY = "Plain TeX multilanguage support"
DESCRIPTION = "CSplain is a small extension of basic Plain TeX macros, the \
formats csplain and pdfcsplain can be generated. It supports: \
hyphenation of words for 50+ languages, simple and powerful \
font loading system (various sizes of fonts), TeX, pdfTeX, \
XeTeX and LuaTeX engines, math fonts simply loaded with full \
amstex-like features, three internal encodings (IL2 for \
Czech/Slovak languages, T1 for many languages with latin \
alphabet and Unicode in new TeX engines), natural UTF-8 input \
in pdfTeX using encTeX without any active characters, Czech and \
Slovak special typesetting features. An important part of the \
package is OPmac, which implements most of LaTeX's features \
(sectioning, font selection, color, hyper reference and urls, \
bibliography, index, toc, tables,etc.) by Plain TeX macros. The \
OPmac macros can generate and bibliography without any external \
program."
LICENSE = "LPPL-1.0"

PV = "2023.209.mar._2022svn62771"

RPM_NAME = "texlive-csplain-2023.209.mar._2022svn62771-55.1.noarch.rpm"
RPM_HASH = "d6f5fd3681b44eb37b6ed8168a276e83972b03353fa0caa7df5afcba33367d9ac11c321135495bd4cfeb3125d5379a9a572dbd7da273c129078e0152ebfb3fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ams-math.tex \
tex-cavantga.tex \
tex-cbookman.tex \
tex-chars-8z.tex \
tex-chelvet.tex \
tex-cncent.tex \
tex-cpalatin.tex \
tex-cs-adventor.tex \
tex-cs-all.tex \
tex-cs-antt.tex \
tex-cs-arev.tex \
tex-cs-baskerx.tex \
tex-cs-bera.tex \
tex-cs-bonum.tex \
tex-cs-charter.tex \
tex-cs-cursor.tex \
tex-cs-ebgaramond.tex \
tex-cs-heros.tex \
tex-cs-heuristica.tex \
tex-cs-iwona.tex \
tex-cs-kurier.tex \
tex-cs-libertine.tex \
tex-cs-pagella.tex \
tex-cs-polta.tex \
tex-cs-schola.tex \
tex-cs-termes.tex \
tex-csenc-k.tex \
tex-csenc-p.tex \
tex-csenc-u.tex \
tex-csenc-w.tex \
tex-csfonts.tex \
tex-csfontsm.tex \
tex-ctimes.tex \
tex-cyrchars.tex \
tex-czhyphen.tex \
tex-dcfonts.tex \
tex-ecfonts.tex \
tex-etex-mac.tex \
tex-exchars.tex \
tex-extcode.tex \
tex-ff-mac.tex \
tex-fontfam-catalog.tex \
tex-fontfam-global.tex \
tex-fontfam.tex \
tex-fonttabs.tex \
tex-glyphtounicode-cs.tex \
tex-il2code.tex \
tex-ki-math.tex \
tex-kp-fonts.tex \
tex-kp-math.tex \
tex-lmfonts.tex \
tex-luafonts.tex \
tex-ntx-math.tex \
tex-opmac-bib-iso690.tex \
tex-opmac-bib-simple.tex \
tex-opmac-bib.tex \
tex-opmac-luatex.tex \
tex-opmac-xetex.tex \
tex-opmac.tex \
tex-pazo-math.tex \
tex-pdfuni.tex \
tex-plaina4.tex \
tex-skhyphen.tex \
tex-t1code.tex \
tex-t1enc-u.tex \
tex-tx-math.tex \
tex-ucode.tex \
tex-uni-lcuc.tex \
tex-uni-math.tex \
tex-unifam.tex \
texlive-csplain"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-cm \
texlive-cs \
texlive-csplain-bin \
texlive-enctex \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luatex \
texlive-luatex85 \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex \
texlive-tex-ini-files"

inherit rpm
