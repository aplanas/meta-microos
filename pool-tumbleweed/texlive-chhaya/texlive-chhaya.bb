SUMMARY = "Linguistic glossing in Marathi language"
DESCRIPTION = "muNbii vidyaapiitthaacyaa chaayaalekhn niymaavliis anusruun \
bhaassaavaijnyaanik chaayaaNgaaNce sNkssep purvnnaaraa \
aajnyaasNc. This package provides macros for linguistic \
glossing as per the rules given by Mumbai University."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.4svn61719"

RPM_NAME = "texlive-chhaya-2023.209.0.0.4svn61719-54.1.noarch.rpm"
RPM_HASH = "7f869049e4a3b51c09c20172a0d3f4d9d3e5ed1cd220daf62cfa220641901dd6c77e60ba118fc15bd9823b8e5bb5dac63942f5f761af0d4564400a1e5493825c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chhaya.sty \
tex-sankshep.tex \
texlive-chhaya"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-glossaries.sty \
tex-iftex.sty \
tex-marathi.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
