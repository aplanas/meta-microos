SUMMARY = "Typesetting TEI-xml compliant Critical Editions"
DESCRIPTION = "ekdosis is a LuaLaTeX package designed for multilingual \
critical editions. It can be used to typeset texts and \
different layers of critical notes in any direction accepted by \
LuaTeX. Texts can be arranged in running paragraphs or on \
facing pages, in any number of columns which in turn can be \
synchronized or not. In addition to printed texts, ekdosis can \
convert .tex source files so as to produce TEI xml-compliant \
critical editions. Database-driven encoding under LaTeX then \
allows extraction of texts entered segment by segment according \
to various criteria: main edited text, variant readings, \
translations or annotated borrowings between texts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn61113"

RPM_NAME = "texlive-ekdosis-2023.209.1.4svn61113-54.1.noarch.rpm"
RPM_HASH = "b98122c946cd6aa8d1b9ebe9b49c0e3f859a4d4dad10e5581bdfece9565015760fd1ed4ed43e58ba5838925e192ca346a698c59d5660d3d1ee7ce63133988407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ekdosis.sty \
texlive-ekdosis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expkv-def.sty \
tex-expkv-opt.sty \
tex-ifoddpage.sty \
tex-iftex.sty \
tex-keyfloat.sty \
tex-lineno.sty \
tex-ltxcmds.sty \
tex-luacode.sty \
tex-paracol.sty \
tex-parnotes.sty \
tex-pdftexcmds.sty \
tex-refcount.sty \
tex-tcolorbox.sty \
tex-trivfloat.sty \
tex-verse.sty \
tex-zref-abspage.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
