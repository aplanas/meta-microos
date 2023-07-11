SUMMARY = "A TeX extension that translates input on its way into TeX"
DESCRIPTION = "EncTeX is (another) TeX extension, written at the change-file \
level. It provides means of translating input on the way into \
TeX. It allows, for example, translation of multibyte \
sequences, such as utf-8 encoding."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn34957"

RPM_NAME = "texlive-enctex-2023.201.svn34957-53.2.noarch.rpm"
RPM_HASH = "fe6a8a64ceca5c5021630d52475580020339d8c03052b5af9c8e256effd2190183660986f1d7ae520c837cb6151a0850a965140f99077230d0c9e7bb48f8358e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-1250-csf.tex \
tex-1250-il2.tex \
tex-1250-latex.tex \
tex-1250-t1.tex \
tex-852-csf.tex \
tex-852-il2.tex \
tex-852-latex.tex \
tex-852-t1.tex \
tex-csfmacro.tex \
tex-enc-u.tex \
tex-encmacro.tex \
tex-il2-1250.tex \
tex-il2-852.tex \
tex-il2-csf.tex \
tex-il2-kam.tex \
tex-il2-t1.tex \
tex-kam-csf.tex \
tex-kam-il2.tex \
tex-kam-latex.tex \
tex-kam-t1.tex \
tex-mixcodes.tex \
tex-noprefnt.tex \
tex-plain-1250-cs.tex \
tex-plain-852-cs.tex \
tex-plain-il2-cs.tex \
tex-plain-kam-cs.tex \
tex-plain-utf8-cs.tex \
tex-plain-utf8-ec.tex \
tex-polyset.tex \
tex-t1macro.tex \
tex-utf8-csf.tex \
tex-utf8-t1.tex \
tex-utf8cseq.tex \
tex-utf8lat1.tex \
tex-utf8lata.tex \
tex-utf8math.tex \
tex-utf8off.tex \
tex-utf8raw.tex \
tex-utf8unkn.tex \
tex-utf8warn.tex \
texlive-enctex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
