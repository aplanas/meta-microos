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

RPM_NAME = "texlive-ekdosis-2023.209.1.4svn61113-54.2.noarch.rpm"
RPM_HASH = "a3f7605c1faeae03988569c1c19306151e0b9b4cdb1a9d0ab85d427ebccdcd03f3e4e20f1167e3a6cdf26e41cda2c2b0de9e9cc3abec24899f89485403bbf16b"
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
