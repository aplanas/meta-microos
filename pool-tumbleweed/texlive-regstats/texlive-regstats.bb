SUMMARY = "Information about register use"
DESCRIPTION = "The package will report number of used registers (counter, \
dimen, skip, muskip, box, token, input, output, math families, \
languages, insertions), and will compare the number to the \
maximum available number of such registers."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn25050"

RPM_NAME = "texlive-regstats-2023.209.1.0hsvn25050-54.2.noarch.rpm"
RPM_HASH = "5ff63732d667b37c4d4c998a8d069e71f16dfaed6815a55ce0b8f5d2181d07fc5a785188091a7c5f8b6e943c42d72a1dd21162716efca1ffe665addf53084b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regstats.sty \
texlive-regstats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-etex.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-intcalc.sty \
tex-kvoptions.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
