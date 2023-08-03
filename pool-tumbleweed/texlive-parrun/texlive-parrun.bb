SUMMARY = "Typesets (two) streams of text running parallel"
DESCRIPTION = "For typesetting translated text and the original source, \
parallel on the same page, one above the other."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-parrun-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "b60772618669c868eaec370b31d5c70048aade5569b5750b47081ea49d487f18ae912d031a4512cc35218e8dadb54125cea1a6320c35c099d0599b85a416e45e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parrun.sty \
texlive-parrun"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
