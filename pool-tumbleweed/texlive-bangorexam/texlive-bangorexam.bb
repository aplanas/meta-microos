SUMMARY = "Typeset an examination at Bangor University"
DESCRIPTION = "The package allows typesetting of Bangor Univesity's exam \
style. It currently supports a standard A/B choice, A-only \
compulsory and 'n' from 'm' exam styles. Marks are totalled and \
checked automatically."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.0svn65140"

RPM_NAME = "texlive-bangorexam-2023.209.1.5.0svn65140-54.1.noarch.rpm"
RPM_HASH = "f93ae70fcbd974b59b49926f9ba187a791fa992a37db51569a5d37f33d522935cf8b3d71b1af386b1ea02786312bd2d4d165d4d50afa27073c77ae72302a9d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bangorexam.cls \
texlive-bangorexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-babel.sty \
tex-color.sty \
tex-courier.sty \
tex-etoolbox.sty \
tex-exam.cls \
tex-fontenc.sty \
tex-forloop.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-isodate.sty \
tex-letltxmacro.sty \
tex-newpxmath.sty \
tex-newpxtext.sty \
tex-tikz.sty \
tex-totcount.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
