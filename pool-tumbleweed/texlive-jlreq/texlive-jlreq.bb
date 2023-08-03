SUMMARY = "Japanese document class based on requirements for Japanese text layout"
DESCRIPTION = "This package provides a Japanese document class based on \
requirements for Japanese text layout. The class file and the \
JFM (Japanese font metric) files for LuaTeX-ja / pLaTeX / \
upLaTeX are provided."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66362"

RPM_NAME = "texlive-jlreq-2023.209.svn66362-56.1.noarch.rpm"
RPM_HASH = "62bfc16a948d874b5bbbb10b3fa23076769d855adcb9a6b1c1550ba454a858a3cedfaf94b7b371879de2a509a2284bed29da2153eebc1fb4b358ca67219ff842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bjlreq-v.tfm \
tex-bjlreq-v.vf \
tex-bjlreq.tfm \
tex-bjlreq.vf \
tex-bjlreqg-v.tfm \
tex-bjlreqg-v.vf \
tex-bjlreqg.tfm \
tex-bjlreqg.vf \
tex-bzjlreq-v.tfm \
tex-bzjlreq-v.vf \
tex-bzjlreq.tfm \
tex-bzjlreq.vf \
tex-bzjlreqg-v.tfm \
tex-bzjlreqg-v.vf \
tex-bzjlreqg.tfm \
tex-bzjlreqg.vf \
tex-jlreq-complements.sty \
tex-jlreq-helpers.sty \
tex-jlreq-jidori.tfm \
tex-jlreq-jidori.vf \
tex-jlreq-trimmarks.sty \
tex-jlreq-v-jidori.tfm \
tex-jlreq-v-jidori.vf \
tex-jlreq-v.tfm \
tex-jlreq-v.vf \
tex-jlreq.cls \
tex-jlreq.tfm \
tex-jlreq.vf \
tex-jlreqg-jidori.tfm \
tex-jlreqg-jidori.vf \
tex-jlreqg-v-jidori.tfm \
tex-jlreqg-v-jidori.vf \
tex-jlreqg-v.tfm \
tex-jlreqg-v.vf \
tex-jlreqg.tfm \
tex-jlreqg.vf \
tex-ubjlreq-q.tfm \
tex-ubjlreq-q.vf \
tex-ubjlreq-v.tfm \
tex-ubjlreq-v.vf \
tex-ubjlreq.tfm \
tex-ubjlreq.vf \
tex-ubjlreqg-q.tfm \
tex-ubjlreqg-q.vf \
tex-ubjlreqg-v.tfm \
tex-ubjlreqg-v.vf \
tex-ubjlreqg.tfm \
tex-ubjlreqg.vf \
tex-ubzjlreq-q.tfm \
tex-ubzjlreq-q.vf \
tex-ubzjlreq-v.tfm \
tex-ubzjlreq-v.vf \
tex-ubzjlreq.tfm \
tex-ubzjlreq.vf \
tex-ubzjlreqg-q.tfm \
tex-ubzjlreqg-q.vf \
tex-ubzjlreqg-v.tfm \
tex-ubzjlreqg-v.vf \
tex-ubzjlreqg.tfm \
tex-ubzjlreqg.vf \
tex-ujlreq-jidori-q.tfm \
tex-ujlreq-jidori-q.vf \
tex-ujlreq-jidori.tfm \
tex-ujlreq-jidori.vf \
tex-ujlreq-q.tfm \
tex-ujlreq-q.vf \
tex-ujlreq-v-jidori.tfm \
tex-ujlreq-v-jidori.vf \
tex-ujlreq-v.tfm \
tex-ujlreq-v.vf \
tex-ujlreq.tfm \
tex-ujlreq.vf \
tex-ujlreqg-jidori-q.tfm \
tex-ujlreqg-jidori-q.vf \
tex-ujlreqg-jidori.tfm \
tex-ujlreqg-jidori.vf \
tex-ujlreqg-q.tfm \
tex-ujlreqg-q.vf \
tex-ujlreqg-v-jidori.tfm \
tex-ujlreqg-v-jidori.vf \
tex-ujlreqg-v.tfm \
tex-ujlreqg-v.vf \
tex-ujlreqg.tfm \
tex-ujlreqg.vf \
tex-uzjlreq-q.tfm \
tex-uzjlreq-q.vf \
tex-uzjlreq-v.tfm \
tex-uzjlreq-v.vf \
tex-uzjlreq.tfm \
tex-uzjlreq.vf \
tex-uzjlreqg-q.tfm \
tex-uzjlreqg-q.vf \
tex-uzjlreqg-v.tfm \
tex-uzjlreqg-v.vf \
tex-uzjlreqg.tfm \
tex-uzjlreqg.vf \
tex-zjlreq-v.tfm \
tex-zjlreq-v.vf \
tex-zjlreq.tfm \
tex-zjlreq.vf \
tex-zjlreqg-v.tfm \
tex-zjlreqg-v.vf \
tex-zjlreqg.tfm \
tex-zjlreqg.vf \
texlive-jlreq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-everyhook.sty \
tex-filehook.sty \
tex-gbm.tfm \
tex-gbmv.tfm \
tex-l3keys2e.sty \
tex-lmodern.sty \
tex-luatexja-adjust.sty \
tex-luatexja.sty \
tex-rml.tfm \
tex-rmlv.tfm \
tex-upgbm-h.tfm \
tex-upgbm-hq.tfm \
tex-upgbm-v.tfm \
tex-uprml-h.tfm \
tex-uprml-hq.tfm \
tex-uprml-v.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
