SUMMARY = "Font definitions for the variable Latin Modern fonts"
DESCRIPTION = "This package provides a mechanism for scaling a typeface. It is \
directed at the Latin Modern fonts and provides the font \
definitions and the corresponding style file. This mechanism is \
useful in mixed text compositions, for example Japanese-Latin."
LICENSE = "LPPL-1.3c"

PV = "2023.209.1.2svn60014"

RPM_NAME = "texlive-variablelm-2023.209.1.2svn60014-54.1.noarch.rpm"
RPM_HASH = "e495e55e1bd899bd23cfd56b5c209e3eb40df43eddbc44915096a3b3f6aab37a92200dcce55343db90459d8ccb2dec48afb018e2e0e32902930c8904d4bafb6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-omlvlmm.fd \
tex-omlvlmr.fd \
tex-omsvlmr.fd \
tex-omsvlmsy.fd \
tex-omxvlmex.fd \
tex-ot1vlmr.fd \
tex-ot1vlmtt.fd \
tex-t1vlmr.fd \
tex-t1vlmss.fd \
tex-t1vlmssq.fd \
tex-t1vlmtt.fd \
tex-t1vlmvtt.fd \
tex-ts1vlmr.fd \
tex-variablelm.sty \
texlive-variablelm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fontenc.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
