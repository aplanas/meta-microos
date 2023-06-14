SUMMARY = "Poor man's Hangul Jamo input method"
DESCRIPTION = "This package provides a Hangul transliteration input method \
that allows to typeset Korean letters (Hangul) using the proper \
fonts. The name is derived from 'Poor man's Hangul Jamo Input \
Method'. The use of XeLaTeX is recommended. pdfTeX is not \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn66361"

RPM_NAME = "texlive-pmhanguljamo-2023.201.1.0.2svn66361-52.1.noarch.rpm"
RPM_HASH = "4bc09120234b3331a7d41e665c75de04ebffca1413e02d166405021553aa16a4727d8b60a08eee8780e6401673133cf7d25afe86244e08cc4fd266a1fc131311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frkjamofull.data.tex \
tex-pmhanguljamo-frkim.code.tex \
tex-pmhanguljamo-frkim.sty \
tex-pmhanguljamo-rrk.sty \
tex-pmhanguljamo.sty \
texlive-pmhanguljamo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
