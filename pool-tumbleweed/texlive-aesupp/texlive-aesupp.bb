SUMMARY = "Special support for the ae character"
DESCRIPTION = "This package provides special support for the italic 'ae' \
character in some fonts, due to design flaws (in the author's \
opinion) regarding this character. At the moment only the fonts \
TeX Gyre Bonum, TeX Gyre Schola, TeX Gyre Pagella, and the \
Latin Modern fonts are supported. The other fonts in the TeX \
Gyre bundle do not need this support."
LICENSE = "LPPL-1.3c"

PV = "2023.201.1svn58253"

RPM_NAME = "texlive-aesupp-2023.201.1svn58253-54.1.noarch.rpm"
RPM_HASH = "b778637d8875eb618c58c0e2981c894d483fad2c885b547f5de60da546bec4c71e4ac1fee921159399c37357d01fd73d45799e11f5346a233741e96ce213add1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aebkbi.tfm \
tex-aebkri.tfm \
tex-aecsbi.tfm \
tex-aecsri.tfm \
tex-aembxi10.tfm \
tex-aemri10.tfm \
tex-aemri12.tfm \
tex-aemri7.tfm \
tex-aemri8.tfm \
tex-aemri9.tfm \
tex-aemtti10.tfm \
tex-aeplbi.tfm \
tex-aeplri.tfm \
tex-aesupp.map \
tex-aesupp.sty \
tex-ec-aebkbi.tfm \
tex-ec-aebkri.tfm \
tex-ec-aecsbi.tfm \
tex-ec-aecsri.tfm \
tex-ec-aembxi10.tfm \
tex-ec-aemri10.tfm \
tex-ec-aemri12.tfm \
tex-ec-aemri7.tfm \
tex-ec-aemri8.tfm \
tex-ec-aemri9.tfm \
tex-ec-aemtti10.tfm \
tex-ec-aeplbi.tfm \
tex-ec-aeplri.tfm \
tex-rm-aebkbi.tfm \
tex-rm-aebkri.tfm \
tex-rm-aecsbi.tfm \
tex-rm-aecsri.tfm \
tex-rm-aembxi10.tfm \
tex-rm-aemri10.tfm \
tex-rm-aemri12.tfm \
tex-rm-aemri7.tfm \
tex-rm-aemri8.tfm \
tex-rm-aemri9.tfm \
tex-rm-aemtti10.tfm \
tex-rm-aeplbi.tfm \
tex-rm-aeplri.tfm \
tex-tg.enc \
texlive-aesupp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-updmap.cfg \
texlive \
texlive-aesupp-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
