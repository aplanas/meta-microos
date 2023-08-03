SUMMARY = "Poor man's Hangul Jamo input method"
DESCRIPTION = "This package provides a Hangul transliteration input method \
that allows to typeset Korean letters (Hangul) using the proper \
fonts. The name is derived from 'Poor man's Hangul Jamo Input \
Method'. The use of XeLaTeX is recommended. pdfTeX is not \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn66361"

RPM_NAME = "texlive-pmhanguljamo-2023.209.1.0.2svn66361-53.1.noarch.rpm"
RPM_HASH = "449a20b888dcb5d7fc082aff0b1d64c0447adcc9c3b2d1ad13f186635fb7ec4527d902820c701c4cab222ca4be74366e8dbd0251dc40f2ec40550b10c67eadcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frkjamofull.data.tex \
tex-pmhanguljamo-frkim.code.tex \
tex-pmhanguljamo-frkim.sty \
tex-pmhanguljamo-rrk.sty \
tex-pmhanguljamo.sty \
texlive-pmhanguljamo"

RDEPENDS:${PN} += "/usr/bin/sh \
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
