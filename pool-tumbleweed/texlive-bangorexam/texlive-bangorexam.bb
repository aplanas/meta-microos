SUMMARY = "Typeset an examination at Bangor University"
DESCRIPTION = "The package allows typesetting of Bangor Univesity's exam \
style. It currently supports a standard A/B choice, A-only \
compulsory and 'n' from 'm' exam styles. Marks are totalled and \
checked automatically."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.0svn65140"

RPM_NAME = "texlive-bangorexam-2023.201.1.5.0svn65140-53.1.noarch.rpm"
RPM_HASH = "ea906d29aedf2e79446726dcae31076715facd73c67f0baa2d966362bff5d2f06b4e113259dd9cf1af050db192681a55a10a84568150faeda02bd67d5e2576ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bangorexam.cls) \
texlive-bangorexam"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(babel.sty) \
tex(color.sty) \
tex(courier.sty) \
tex(etoolbox.sty) \
tex(exam.cls) \
tex(fontenc.sty) \
tex(forloop.sty) \
tex(graphicx.sty) \
tex(inputenc.sty) \
tex(isodate.sty) \
tex(letltxmacro.sty) \
tex(newpxmath.sty) \
tex(newpxtext.sty) \
tex(tikz.sty) \
tex(totcount.sty) \
tex(xcolor.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
