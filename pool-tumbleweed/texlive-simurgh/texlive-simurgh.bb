SUMMARY = "Typeset Parsi in LuaLaTeX"
DESCRIPTION = "The package provides an automatic and unified interface for \
Parsi typesetting in LaTeX, using the LuaTeX engine. The \
project to produce this system is dedicated to Ferdowsi The \
Great."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.01bsvn31719"

RPM_NAME = "texlive-simurgh-2023.209.0.0.01bsvn31719-58.1.noarch.rpm"
RPM_HASH = "29baa5841238868ecb09cd9b4b94ff67519b74364ce7d705ba1f78ac59ddc0727c1505ddc3977826ecdefc63b38cffcc55909d263bc00d217d4bfe7069e08e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simurgh-abjad.sty \
tex-simurgh-adadi.sty \
tex-simurgh-algorithm.sty \
tex-simurgh-algorithmic.sty \
tex-simurgh-amsart.sty \
tex-simurgh-amsbook.sty \
tex-simurgh-amsmath.sty \
tex-simurgh-amstext.sty \
tex-simurgh-amsthm.sty \
tex-simurgh-array.sty \
tex-simurgh-article.sty \
tex-simurgh-artikel1.sty \
tex-simurgh-artikel2.sty \
tex-simurgh-artikel3.sty \
tex-simurgh-arydshln.sty \
tex-simurgh-backref.sty \
tex-simurgh-bidi.sty \
tex-simurgh-boek.sty \
tex-simurgh-boek3.sty \
tex-simurgh-book.sty \
tex-simurgh-bookest.sty \
tex-simurgh-caption3.sty \
tex-simurgh-chkeng.sty \
tex-simurgh-clss.sty \
tex-simurgh-counters.sty \
tex-simurgh-cptns.sty \
tex-simurgh-doc.cls \
tex-simurgh-empheq.sty \
tex-simurgh-extarticle.sty \
tex-simurgh-extbook.sty \
tex-simurgh-extletter.sty \
tex-simurgh-extreport.sty \
tex-simurgh-fleqn.sty \
tex-simurgh-fonts.sty \
tex-simurgh-footnotes.sty \
tex-simurgh-ftnxtra.sty \
tex-simurgh-glossaries.sty \
tex-simurgh-harfi.sty \
tex-simurgh-jalalical.sty \
tex-simurgh-leqno.sty \
tex-simurgh-letter.sty \
tex-simurgh-lettrine.sty \
tex-simurgh-loader.sty \
tex-simurgh-ltx.sty \
tex-simurgh-mathdigitspec.sty \
tex-simurgh-memoir.sty \
tex-simurgh-minitoc.sty \
tex-simurgh-natbib.sty \
tex-simurgh-pkgs.sty \
tex-simurgh-poem.sty \
tex-simurgh-rapport1.sty \
tex-simurgh-rapport3.sty \
tex-simurgh-refrep.sty \
tex-simurgh-report.sty \
tex-simurgh-scrartcl.sty \
tex-simurgh-scrbook.sty \
tex-simurgh-scrlettr.sty \
tex-simurgh-scrreprt.sty \
tex-simurgh-shellescape.sty \
tex-simurgh-tags.sty \
tex-simurgh-tartibi.sty \
tex-simurgh-tools.sty \
tex-simurgh-unibidi.sty \
tex-simurgh.sty \
texlive-simurgh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algorithmic.sty \
tex-amsmath.sty \
tex-amstext.sty \
tex-amsthm.sty \
tex-array.sty \
tex-article.sty \
tex-arydshln.sty \
tex-auxhook.sty \
tex-backref.sty \
tex-book.sty \
tex-caption3.sty \
tex-empheq.sty \
tex-fleqn.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-leqno.sty \
tex-letter.sty \
tex-lettrine.sty \
tex-ltxcmds.sty \
tex-ltxdoc.cls \
tex-makeidx.sty \
tex-microtype.sty \
tex-minitoc.sty \
tex-minted.sty \
tex-natbib.sty \
tex-pdftexcmds.sty \
tex-report.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
