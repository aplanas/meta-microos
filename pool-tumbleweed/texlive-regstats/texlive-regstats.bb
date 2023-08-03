SUMMARY = "Information about register use"
DESCRIPTION = "The package will report number of used registers (counter, \
dimen, skip, muskip, box, token, input, output, math families, \
languages, insertions), and will compare the number to the \
maximum available number of such registers."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn25050"

RPM_NAME = "texlive-regstats-2023.209.1.0hsvn25050-54.1.noarch.rpm"
RPM_HASH = "84924f804d51635e31cee1778740ebef2b6407326a3e17a16b963601c17ac206a2eb36727f8e4becda376558d36e5c4f65967146d7828d05b5cdd0df55412aa8"
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
